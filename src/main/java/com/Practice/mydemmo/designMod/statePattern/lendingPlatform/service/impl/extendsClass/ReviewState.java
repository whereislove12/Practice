package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

class ReviewState extends AbstractState {
 
    @Override
    public void makePriceEvent(Context context) {
        context.setState(new PublishState());
    }
 
    @Override
    public String getCurrentState() {
        return StateEnum.REVIEWED.getValue();
    }
 
}