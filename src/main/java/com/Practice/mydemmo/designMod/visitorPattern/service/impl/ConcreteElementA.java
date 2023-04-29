package com.Practice.mydemmo.designMod.visitorPattern.service.impl;

import com.Practice.mydemmo.designMod.visitorPattern.service.Element;
import com.Practice.mydemmo.designMod.visitorPattern.service.Visitor;

//具体元素A类
public class ConcreteElementA implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作。";
    }
}