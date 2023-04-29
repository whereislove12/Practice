package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnglishTeacher extends Employee {
    private String name;

    @Override
    public void eat() {
        System.out.println("英语老师吃西餐");
    }

    @Override
    void work() {
        System.out.println("英语老师教英语");
    }

    @Override
    protected void sleep() {
        System.out.println("英语老师睡大觉");
    }

    public Integer getDefaultAge(){
        return super.getAge();
    }
}
