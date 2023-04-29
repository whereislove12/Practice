package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic1;


public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "吃骨头");
    }

    @Override
    public void shout() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "汪汪叫");
    }

    @Override
    public void sleep() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "趴着睡大觉");
    }

    public void watchDoor() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "正在看门");
    }
}
