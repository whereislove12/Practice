package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day2_Operator;

import org.junit.jupiter.api.Test;

/**
 * 运算符号
 */
public class SignOfOperation {
    @Test
    public void operation1() {
        int a = 5;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        //两个数异或运算,转换为二进制数字,相同取0,不同取1
        System.out.println("a ^ b = " + (a ^ b));
        //异或满足交换律,相同为0, 0 ^ b = b
        System.out.println("(a ^ b) ^ a = " + ((a ^ b) ^ a));
        System.out.println("a | b = " + (a | b));
        System.out.println("a & b = " + (a & b));
    }
}
