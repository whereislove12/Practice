package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog {
    private String name;
    private Integer age;

    public void eat(){
        System.out.println("狗吃骨头");
    }
}
