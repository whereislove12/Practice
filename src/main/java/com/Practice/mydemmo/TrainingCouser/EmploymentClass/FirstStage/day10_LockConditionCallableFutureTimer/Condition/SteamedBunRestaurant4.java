package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Condition;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

@Data
@NoArgsConstructor
public class SteamedBunRestaurant4 {
    private int steamedStuffedBunCount;
    private boolean flag;

    private Lock lock = new ReentrantLock();
    Condition producerCondition = lock.newCondition();
    Condition consumerCondition = lock.newCondition();

    public SteamedBunRestaurant4(int steamedStuffedBunCount, boolean flag) {
        this.steamedStuffedBunCount = steamedStuffedBunCount;
        this.flag = flag;
    }

    public void makeSteamedBunRestaurant() {
        lock.lock();
        while (flag) {
            try {
                producerCondition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        steamedStuffedBunCount++;
        System.out.println(Thread.currentThread().getName() + "正在做第" + steamedStuffedBunCount + "个包子");
        flag = true;
        consumerCondition.signal();
        lock.unlock();
    }

    public void getSteamedBunRestaurant() {
        lock.lock();
        while (!flag) {
            try {
                consumerCondition.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(Thread.currentThread().getName() + "正在吃第" + steamedStuffedBunCount + "个包子");
        flag = false;
        producerCondition.signal();
        lock.unlock();
    }
}
