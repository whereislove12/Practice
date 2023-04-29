package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 生产者
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producer1 implements Runnable {
    private SteamedBunRestaurant1 steamedBunRestaurant1;

    @Override
    public void run() {
        while (true) {
            synchronized (steamedBunRestaurant1) {
                if (steamedBunRestaurant1.isFlag()) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                steamedBunRestaurant1.makeStreamedStuffedBun();
                steamedBunRestaurant1.setFlag(true);
                notify();
            }
        }
    }
}
