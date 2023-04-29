package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 抽象类必须有构造方法
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Employee {
    protected String name;
    protected Integer id;

    public abstract void work();
}
