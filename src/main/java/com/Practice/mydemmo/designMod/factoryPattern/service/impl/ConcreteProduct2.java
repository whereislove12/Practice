package com.Practice.mydemmo.designMod.factoryPattern.service.impl;

import com.Practice.mydemmo.designMod.factoryPattern.service.Product;

//具体产品2：实现抽象产品中的抽象方法
public class ConcreteProduct2 implements Product {
    public void show() {
        System.out.println("具体产品2显示...");
    }
}