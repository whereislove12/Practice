package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 员工类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private String name;
    private Integer age = 18;
    private BigDecimal salary;

    /**
     * protected 权限,本类,同包下,子类都可以访问
     */
    protected void eat() {

    }

    /**
     * 默认权限 default 本类和同包下可以访问
     */
    void work() {

    }

    /**
     * protected 权限,本类,同包下,子类都可以访问
     */
    protected void sleep() {

    }
}
