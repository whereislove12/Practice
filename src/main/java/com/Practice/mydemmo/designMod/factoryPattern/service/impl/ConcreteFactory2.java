package com.Practice.mydemmo.designMod.factoryPattern.service.impl;

import com.Practice.mydemmo.designMod.factoryPattern.service.AbstractFactory;
import com.Practice.mydemmo.designMod.factoryPattern.service.Product;

//具体工厂2：实现了厂品的生成方法
public class ConcreteFactory2 implements AbstractFactory {
    public Product newProduct() {
        System.out.println("具体工厂2生成-->具体产品2...");
        return new ConcreteProduct2();
    }
}