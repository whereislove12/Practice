package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Athletes;

public class FootBallAthletes extends Athletes {


    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的足球运动员" + this.getName() + "吃鲍鱼");
    }


    @Override
    public void runPrizes() {
        System.out.println(this.getAge() + "岁的足球运动员" + this.getName() + "比赛踢假球");
    }
}
