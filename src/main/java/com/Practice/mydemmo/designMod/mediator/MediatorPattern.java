package com.Practice.mydemmo.designMod.mediator;

import com.Practice.mydemmo.designMod.mediator.abstractClass.Colleague;
import com.Practice.mydemmo.designMod.mediator.abstractClass.Mediator;
import com.Practice.mydemmo.designMod.mediator.abstractClass.extendsClass.ConcreteColleague1;
import com.Practice.mydemmo.designMod.mediator.abstractClass.extendsClass.ConcreteColleague2;
import com.Practice.mydemmo.designMod.mediator.abstractClass.extendsClass.ConcreteMediator;

//测试
public class MediatorPattern {
    public static void main(String[] args) {
        Mediator md = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();
        md.register(c1);
        md.register(c2);
        c1.send();
        System.out.println("-------------");
        c2.send();
    }
}