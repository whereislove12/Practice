package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("狗汪汪叫");
    }

    @Override
    public void sleep() {
        System.out.println("小狗睡在狗窝");
    }
}
