package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic3.Abstract;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
abstract public class People {
    private String name;
    private Integer age;

    public abstract void eat();
}
