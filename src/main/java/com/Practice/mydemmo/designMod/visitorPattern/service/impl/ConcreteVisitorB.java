package com.Practice.mydemmo.designMod.visitorPattern.service.impl;

import com.Practice.mydemmo.designMod.visitorPattern.service.Visitor;

//具体访问者B类
public class ConcreteVisitorB implements Visitor {
    public void visit(ConcreteElementA element) {
        System.out.println("具体访问者B访问-->" + element.operationA());
    }

    public void visit(ConcreteElementB element) {
        System.out.println("具体访问者B访问-->" + element.operationB());
    }
}
