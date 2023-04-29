package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

class PaidState extends AbstractState {
 
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }
 
    @Override
    public String getCurrentState() {
        return StateEnum.PAID.getValue();
    }
}