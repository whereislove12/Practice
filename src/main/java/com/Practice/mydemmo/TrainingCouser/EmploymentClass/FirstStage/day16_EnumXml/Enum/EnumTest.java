package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day16_EnumXml.Enum;

import org.junit.Test;

public class EnumTest {
    @Test
    public void test1(){
        System.out.println(EnumIntroduce.MyEnum1.RED);
        System.out.println(EnumIntroduce.MyEnum1.YELLOW);
        System.out.println(EnumIntroduce.MyEnum1.BLUE);
    }

    @Test
    public void test2(){
        System.out.println(EnumIntroduce.MyEnum2.RED.getColor());
        System.out.println(EnumIntroduce.MyEnum2.RED);
    }
}
