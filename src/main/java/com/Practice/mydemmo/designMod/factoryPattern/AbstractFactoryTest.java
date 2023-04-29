package com.Practice.mydemmo.designMod.factoryPattern;

import com.Practice.mydemmo.designMod.factoryPattern.service.Product;
import com.Practice.mydemmo.designMod.factoryPattern.service.impl.ConcreteFactory1;
import com.Practice.mydemmo.designMod.factoryPattern.service.impl.ConcreteFactory2;

//测试
public class AbstractFactoryTest {
    public static void main(String[] args) {
        try {
            ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
            Product product1 = concreteFactory1.newProduct();

            ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
            Product product2 = concreteFactory2.newProduct();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}