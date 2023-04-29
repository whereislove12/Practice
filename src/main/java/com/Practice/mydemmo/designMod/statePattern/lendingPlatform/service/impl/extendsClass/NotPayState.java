package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;


import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

public class NotPayState extends AbstractState {
 
    @Override
    public void payOrderEvent(Context context) {
        context.setState(new PaidState());
    }
 
    @Override
    public void feedBackEvent(Context context) {
        context.setState(new FeedBackState());
    }
 
    @Override
    public String getCurrentState() {
        return StateEnum.NOT_PAY.getValue();
    }
}