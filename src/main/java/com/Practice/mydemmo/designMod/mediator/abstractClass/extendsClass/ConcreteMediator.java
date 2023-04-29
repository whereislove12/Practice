package com.Practice.mydemmo.designMod.mediator.abstractClass.extendsClass;

import com.Practice.mydemmo.designMod.mediator.abstractClass.Colleague;
import com.Practice.mydemmo.designMod.mediator.abstractClass.Mediator;

import java.util.ArrayList;
import java.util.List;

//具体中介者
public class ConcreteMediator extends Mediator {
    private List<Colleague> colleagues = new ArrayList<Colleague>();
    public void register(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMedium(this);
        }
    }
    public void relay(Colleague cl) {
        for (Colleague ob : colleagues) {
            if (!ob.equals(cl)) {
                ((Colleague) ob).receive();
            }
        }
    }
}