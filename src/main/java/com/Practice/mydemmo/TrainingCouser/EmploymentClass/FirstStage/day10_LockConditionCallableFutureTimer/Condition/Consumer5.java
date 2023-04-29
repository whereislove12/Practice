package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Condition;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Consumer5 implements Runnable {
    private SteamedBunRestaurant4 steamedBunRestaurant4;

    @Override
    public void run() {
        while (true) {
            steamedBunRestaurant4.getSteamedBunRestaurant();
        }
    }
}
