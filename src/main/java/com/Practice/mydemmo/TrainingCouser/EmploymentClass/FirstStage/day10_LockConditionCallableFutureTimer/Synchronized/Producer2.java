package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producer2 implements Runnable{
    private SteamedBunRestaurant1 steamedBunRestaurant1;
    @Override
    public void run() {
        while (true){
            synchronized (steamedBunRestaurant1){
                if (steamedBunRestaurant1.isFlag()){
                    try {
                        steamedBunRestaurant1.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                steamedBunRestaurant1.makeStreamedStuffedBun();
                steamedBunRestaurant1.setFlag(true);
                steamedBunRestaurant1.notify();
            }
        }
    }
}
