package com.Practice.mydemmo.designMod.visitorPattern;

import com.Practice.mydemmo.designMod.visitorPattern.service.Visitor;
import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteElementA;
import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteElementB;
import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteVisitorA;
import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteVisitorB;

//测试
public class VisitorPattern {
    public static void main(String[] args) {
        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------------------------");
        visitor = new ConcreteVisitorB();
        os.accept(visitor);
    }
}
