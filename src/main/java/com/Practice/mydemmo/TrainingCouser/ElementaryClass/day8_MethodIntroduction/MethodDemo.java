package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day8_MethodIntroduction;

import org.junit.jupiter.api.Test;

/**
 * 方法练习
 */
public class MethodDemo {
    @Test
    public void testMaxNum1() {
        int maxNum = getMaxNum(10, 15);
        System.out.println(maxNum);
    }

    @Test
    public void testMaxNum2() {
        int maxNum = getMaxNum(20, 15);
        System.out.println(maxNum);
    }

    public static int getMaxNum(int a, int b) {
        return a > b ? a : b;
    }
}
