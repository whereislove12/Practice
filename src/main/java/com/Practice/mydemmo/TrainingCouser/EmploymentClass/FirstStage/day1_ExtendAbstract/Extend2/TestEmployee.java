package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Extend2;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestEmployee {
    /**
     * 子类继承父类的私有成员变量,但是不继承构造方法,如果子类没有定义成员变量,只能用set赋值
     */
    @Test
    public void test1() {
        Employee englishTeacher = new EnglishTeacher("小红");
        englishTeacher.setAge(18);
        englishTeacher.setSalary(new BigDecimal("2500"));
        englishTeacher.eat();
        englishTeacher.work();
        englishTeacher.sleep();

        /**
         * 如果使用泛型,无法使用子类独有的方法,需要转换成子类的类型
         */
        System.out.println("老师的真实年龄是:" + englishTeacher.getAge() + ",默认年龄是:" + ((EnglishTeacher) englishTeacher).getDefaultAge());
    }

    /**
     * 子类不能继承父类的构造方法
     */
    @Test
    public void test2() {
        Employee physicalEducationTeacher = new PhysicalEducationTeacher();
        physicalEducationTeacher.setName("大壮");
        physicalEducationTeacher.setAge(50);
        physicalEducationTeacher.setSalary(new BigDecimal("95000"));
        physicalEducationTeacher.eat();
        physicalEducationTeacher.work();
        physicalEducationTeacher.sleep();
    }
}
