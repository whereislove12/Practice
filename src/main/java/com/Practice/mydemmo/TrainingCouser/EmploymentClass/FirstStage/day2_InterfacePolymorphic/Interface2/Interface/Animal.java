package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface2.Interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Animal implements Eat, Sleep, Run {
    private String name;
    private int age;
}
