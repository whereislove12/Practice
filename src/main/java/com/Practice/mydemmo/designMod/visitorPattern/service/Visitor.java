package com.Practice.mydemmo.designMod.visitorPattern.service;

import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteElementA;
import com.Practice.mydemmo.designMod.visitorPattern.service.impl.ConcreteElementB;

//抽象访问者
public interface Visitor {
    void visit(ConcreteElementA element);

    void visit(ConcreteElementB element);
}