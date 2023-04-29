package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic1;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "吃鱼");
    }

    @Override
    public void shout() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "喵喵叫");
    }


    @Override
    public void sleep() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "晚上不睡觉");
    }

    public void catchMouse() {
        System.out.println(this.getAge() + "岁的" + this.getName() + "正在抓老鼠");
    }
}
