package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

public class GenerateState extends AbstractState {
 
    @Override
    public void checkEvent(Context context) {
        context.setState(new ReviewState());
    }
 
    @Override
    public void checkFailEvent(Context context) {
        context.setState(new FeedBackState());
    }
 
    @Override
    public String getCurrentState() {
        return StateEnum.GENERATE.getValue();
    }
}