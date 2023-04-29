package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day2_Operator;

import org.junit.jupiter.api.Test;

/**
 * 变量
 */
public class VariableDemo {
    @Test
    public void variable1() {
        int a = 10;
        double b;
        b = 3.14;
        System.out.println(a + "---" + b);
    }

    @Test
    public void variable2() {
        int a, b;
        a = 5;
        b = 10;
        double c = 2.56, d = 65.15;
        System.out.println(a + "---" + b + "---" + c + "---" + d);
    }

    @Test
    public void variable3() {
        //定义字节型变量
        byte b = 100;
        System.out.println(b);
        //定义短整型变量
        short s = 1000;
        System.out.println(s);
        //定义整型变量
        int i = 123456;
        System.out.println(i);
        //定义长整型变量
        long l = 12345678900L;
        System.out.println(l);
        //定义单精度浮点型变量
        float f = 5.5F;
        System.out.println(f);
        //定义双精度浮点型变量
        double d = 8.5;
        System.out.println(d);
        //定义布尔型变量
        boolean bool = false;
        System.out.println(bool);
        //定义字符型变量
        char c = 'A';
        System.out.println(c);
    }
}
