package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import org.junit.jupiter.api.Test;

public class TestMath {
    @Test
    public void testMath(){
        double a = 3.14;
        //返回最大整数
        double ceil = Math.ceil(a);
        //返回最小整数
        double floor = Math.floor(a);
        //返回绝对值
        double abs = Math.abs(-a);
        //返回四舍五入的数字
        long round = Math.round(a);
        System.out.println(ceil);
        System.out.println(floor);
        System.out.println(abs);
        System.out.println(round);
    }
}
