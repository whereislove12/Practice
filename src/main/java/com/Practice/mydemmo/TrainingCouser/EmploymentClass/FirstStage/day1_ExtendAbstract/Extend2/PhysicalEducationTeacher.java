package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend2;

/**
 * 体育老师
 */
public class PhysicalEducationTeacher extends Employee {
    @Override
    protected void eat() {
        System.out.println("体育老师吃很多的健身餐");
    }

    @Override
    void work() {
        System.out.println("体育老师不仅教体育,还教语文数学英语");
    }

    @Override
    protected void sleep() {
        System.out.println("体育老师上课睡觉");
    }
}
