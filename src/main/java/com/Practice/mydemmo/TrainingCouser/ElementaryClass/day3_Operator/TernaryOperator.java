package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day3_Operator;

import org.junit.jupiter.api.Test;

/**
 * 三元运算 关系表达式 ? 表达式1 : 表达式2;
 * 问号前面的位置是判断的条件，判断结果为boolean型，为true时调用表达式1，为false时调用表达式2。
 */
public class TernaryOperator {
    @Test
    public void operator1() {
        int a = 5;
        int b = 7;

        System.out.println(a > b ? "大于" : "小于");
        System.out.println(a < b ? "小于" : "大于");
    }
}
