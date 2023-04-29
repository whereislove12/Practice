package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Coach;

public class FootballCoach extends Coach {
    @Override
    public void trainStudent() {
        System.out.println(this.getAge() + "岁的足球教练" + this.getName() + "正在带学生看美女足球");
    }

    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的足球教练" + this.getName() + "吃海参");
    }

}
