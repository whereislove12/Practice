package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Producer3 implements Runnable{
    private SteamedBunRestaurant2 steamedBunRestaurant2;
    @Override
    public void run() {
        while (true){
            steamedBunRestaurant2.makeSteamedBunRestaurant();
        }
    }
}
