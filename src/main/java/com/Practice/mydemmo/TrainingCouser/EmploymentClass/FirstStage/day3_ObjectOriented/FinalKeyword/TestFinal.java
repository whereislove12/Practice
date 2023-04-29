package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day3_ObjectOriented.FinalKeyword;

import org.junit.jupiter.api.Test;

public class TestFinal {
    /**
     * //force：可以将所有 final 字段初始化为 0、null、false。默认为 false
     */
    @Test
    public void test1() {
        FinalDemo1 finalDemo1 = new FinalDemo1();

        System.out.println(finalDemo1);
    }

    /**
     * 当创建对象时,类中有final修饰的成员变量未被赋值时,必须再创建时赋值
     */
    @Test
    public void test2() {
        FinalDemo2 finalDemo2 = new FinalDemo2(50);

        System.out.println(finalDemo2);
    }

}
