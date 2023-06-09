package com.Practice.mydemmo.designMod.mediator.abstractClass;

//抽象同事类
public abstract class Colleague {
    protected Mediator mediator;
    public void setMedium(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void receive();
    public abstract void send();
}