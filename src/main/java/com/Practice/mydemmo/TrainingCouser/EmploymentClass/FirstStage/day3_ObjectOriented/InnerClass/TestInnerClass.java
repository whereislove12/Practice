package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day3_ObjectOriented.InnerClass;

import org.junit.jupiter.api.Test;

/**
 * 内部类静态变量是jdk16+才有的
 */
public class TestInnerClass {
    @Test
    public void test1() {
        InnerClassDemo1.A.str = "我是内部类的静态变量";
        System.out.println(InnerClassDemo1.A.str);
    }
}
