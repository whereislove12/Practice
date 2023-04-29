package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2.Interface.Animal;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "吃鱼");
    }

    @Override
    public void run() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "爬墙");
    }

    @Override
    public void sleep() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "休眠");
    }
}
