package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 消费者
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consumer1 implements Runnable{
    private SteamedBunRestaurant1 steamedBunRestaurant1;
    @Override
    public void run() {
        while (true){
            synchronized (steamedBunRestaurant1){
                if (!steamedBunRestaurant1.isFlag()){
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                steamedBunRestaurant1.getStreamedStuffedBun();
                steamedBunRestaurant1.setFlag(false);
                notify();
            }
        }
    }
}
