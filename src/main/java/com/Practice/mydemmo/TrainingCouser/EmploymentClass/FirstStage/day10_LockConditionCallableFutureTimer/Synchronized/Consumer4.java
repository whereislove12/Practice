package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer4 implements Runnable {
    private SteamedBunRestaurant3 steamedBunRestaurant3;

    @Override
    public void run() {
        while (true)
            steamedBunRestaurant3.getSteamedBunRestaurant();
    }
}
