package com.Practice.mydemmo.designMod.mediator.abstractClass.extendsClass;

import com.Practice.mydemmo.designMod.mediator.abstractClass.Colleague;

//具体同事类
public class ConcreteColleague1 extends Colleague {
    public void receive() {
        System.out.println("具体同事类1收到请求。");
    }
    public void send() {
        System.out.println("具体同事类1发出请求。");
        mediator.relay(this); //请中介者转发
    }
}