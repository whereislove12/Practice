package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract.Coach;
import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Interface.StudyEnglish;

public class PingPangCoach extends Coach implements StudyEnglish {
    @Override
    public void trainStudent() {
        System.out.println(this.getAge() + "岁的乒乓球教练" + this.getName() + "正在教乒乓球");
    }

    @Override
    public void eat() {
        System.out.println(this.getAge() + "岁的乒乓球教练" + this.getName() + "喝茅台");
    }

    @Override
    public void studyEnglish() {
        System.out.println(this.getAge() + "岁的乒乓球教练" + this.getName() + "学英语");
    }
}
