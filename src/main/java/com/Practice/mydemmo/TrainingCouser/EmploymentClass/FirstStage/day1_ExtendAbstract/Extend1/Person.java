package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;

    /**
     * 自我介绍方法
     */
    public void selfIntroduction() {
        System.out.println("大家好,我叫" + this.name + ",今年" + this.age + "岁");
    }

    public void eat(String foodName) {
        System.out.println(this.name + "吃了" + foodName);
    }

    public void sleep() {
        System.out.println(this.name + "睡觉去了");
    }
}