package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

//各种具体状态类
public class FeedBackState extends AbstractState {
 
    @Override
    public String getCurrentState() {
        return StateEnum.FEED_BACKED.getValue();
    }
}