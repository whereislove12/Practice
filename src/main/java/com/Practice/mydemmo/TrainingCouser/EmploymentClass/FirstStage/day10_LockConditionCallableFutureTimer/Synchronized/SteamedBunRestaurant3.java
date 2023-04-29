package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SteamedBunRestaurant3 {
    private Integer steamedStuffedBunCount;
    private boolean flag;

    public synchronized void getSteamedBunRestaurant() {
        while (!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("得到第" + steamedStuffedBunCount + "个包子");
        flag = false;
        notifyAll();
    }

    public synchronized void makeSteamedBunRestaurant() {
        while (flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        steamedStuffedBunCount++;
        System.out.println("正在做第" + steamedStuffedBunCount + "个包子");
        flag = true;
        notifyAll();
    }
}
