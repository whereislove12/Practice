package com.Practice.mydemmo.designMod.visitorPattern.service;

//抽象元素类
public interface Element {
    void accept(Visitor visitor);
}