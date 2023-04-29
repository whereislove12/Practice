package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Athletes;
import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Interface.StudyEnglish;

public class PingPangAthletes extends Athletes implements StudyEnglish {
    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的乒乓球运动员" + this.getName() + "吃鸡胸肉");
    }

    @Override
    public void studyEnglish() {
        System.out.println(this.getAge() + "岁的乒乓球运动员" + this.getName() + "学英语");
    }

    @Override
    public void runPrizes() {
        System.out.println(this.getAge() + "岁的乒乓球运动员" + this.getName() + "参加乒乓球比赛");
    }
}
