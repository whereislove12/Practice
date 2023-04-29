package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Synchronized;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 包子铺
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SteamedBunRestaurant1 {
    private int steamedStuffedBunCount;
    private boolean flag;

    public void getStreamedStuffedBun() {
        System.out.println("得到第" + steamedStuffedBunCount + "个包子");
    }

    public void makeStreamedStuffedBun() {
        steamedStuffedBunCount++;
        System.out.println("正在做第" + steamedStuffedBunCount + "个包子");
    }
}
