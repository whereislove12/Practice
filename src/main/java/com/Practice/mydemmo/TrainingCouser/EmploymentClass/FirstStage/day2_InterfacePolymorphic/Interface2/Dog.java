package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2.Interface.Animal;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "吃骨头");
    }

    @Override
    public void run() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "跑来跑去");
    }

    @Override
    public void sleep() {
        System.out.println(super.getAge() + "岁的" + super.getName() + "进狗窝睡大觉");
    }
}
