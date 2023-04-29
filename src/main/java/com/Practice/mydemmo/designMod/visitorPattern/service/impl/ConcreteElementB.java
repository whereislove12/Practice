package com.Practice.mydemmo.designMod.visitorPattern.service.impl;

import com.Practice.mydemmo.designMod.visitorPattern.service.Element;
import com.Practice.mydemmo.designMod.visitorPattern.service.Visitor;

//具体元素B类
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationB() {
        return "具体元素B的操作。";
    }
}