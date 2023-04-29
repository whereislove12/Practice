package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Condition;

import org.junit.jupiter.api.Test;

/**
 * Condition 将 Object 监视器方法（ wait 、 notify 和 notifyAll ）分解成截然不同的对象，
 * 以便通过将这些对象与任意 Lock 实现组合使用，为每个对象提供多个等待 set（wait-set）。
 * 其中， Lock 替代了 synchronized 方法和语句的使用， Condition 替代了 Object 监视器方法的使用。
 * ****************************************************************************************
 * Lock接口的方法newCondition()获取 :
 * public Condition newCondition()
 * Condition接口常用方法:
 * public void await()         线程等待
 * public void signal()        唤醒一个等待的线程
 * public void singalAll()     唤醒所有等待的线程
 */
public class TestSteamedBunRestaurant2 {
    @Test
    public void test1() {
        SteamedBunRestaurant4 steamedBunRestaurant4 = new SteamedBunRestaurant4(0, false);
        new Thread(new Producer5(steamedBunRestaurant4)).start();
        new Thread(new Producer5(steamedBunRestaurant4)).start();
        new Thread(new Producer5(steamedBunRestaurant4)).start();

        new Thread(new Consumer5(steamedBunRestaurant4)).start();
        new Thread(new Consumer5(steamedBunRestaurant4)).start();
        new Thread(new Consumer5(steamedBunRestaurant4)).start();
    }
}
