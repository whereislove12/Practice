package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day2_Operator;

import org.junit.jupiter.api.Test;

/**
 * 赋值运算
 */
public class AssignmentOperation {
    @Test
    public void operation1() {
        int a = 6;
        int b = 2;

        System.out.println("a += b:" + (a += b));
        System.out.println("a -= b:" + (a -= b));
        System.out.println("a *= b:" + (a *= b));
        System.out.println("a /= b:" + (a /= b));
        System.out.println("a %= b:" + (a %= b));
    }
}
