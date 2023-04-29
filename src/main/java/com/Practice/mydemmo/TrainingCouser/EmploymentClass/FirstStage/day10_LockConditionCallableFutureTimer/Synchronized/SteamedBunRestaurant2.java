package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SteamedBunRestaurant2 {
    private Integer steamedStuffedBunCount;
    private boolean flag;

    public synchronized void makeSteamedBunRestaurant() {
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        steamedStuffedBunCount++;
        System.out.println("正在做第" + steamedStuffedBunCount + "个包子");
        flag = true;
        notify();
    }

    public synchronized void getSteamedBunRestaurant(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("得到第" + steamedStuffedBunCount + "个包子");
        flag = false;
        notify();
    }
}
