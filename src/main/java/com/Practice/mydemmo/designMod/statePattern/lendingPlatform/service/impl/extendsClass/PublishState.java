package com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.extendsClass;

import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.enums.StateEnum;
import com.Practice.mydemmo.designMod.statePattern.lendingPlatform.service.impl.AbstractState;

public class PublishState extends AbstractState {
 
    @Override
    public void acceptOrderEvent(Context context) {
        //把当前状态设置为  NotPayState。。。
        //至于应该变成哪个状态，有流程图来决定
        context.setState(new NotPayState());
    }
 
    @Override
    public void notPeopleAcceptEvent(Context context) {
        context.setState(new FeedBackState());
    }
 
    @Override
    public String getCurrentState() {
        return StateEnum.PUBLISHED.getValue();
    }
}