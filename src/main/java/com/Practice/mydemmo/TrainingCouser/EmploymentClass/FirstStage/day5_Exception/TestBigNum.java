package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

public class TestBigNum {
    /**
     * BigInteger
     */
    @Test
    public void testBigInteger() {
        BigInteger bigInteger1 = new BigInteger("14654456486465");
        BigInteger bigInteger2 = new BigInteger("146544561322465");
        //加
        BigInteger add = bigInteger1.add(bigInteger2);
        //减
        BigInteger subtract = bigInteger1.subtract(bigInteger2);
        //乘
        BigInteger multiply = bigInteger1.multiply(bigInteger2);
        //除
        BigInteger divide = bigInteger1.divide(bigInteger2);

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }

    /**
     * BigDecimal
     */
    @Test
    public void testBigDecimal() {
        BigDecimal bigDecimal1 = new BigDecimal("5485246346461.1531");
        BigDecimal bigDecimal2 = new BigDecimal("16846346461.1531");
        //加
        BigDecimal add = bigDecimal1.add(bigDecimal2);
        //减
        BigDecimal subtract = bigDecimal1.subtract(bigDecimal2);
        //乘
        BigDecimal multiply = bigDecimal1.multiply(bigDecimal2);

        /**
         * 除法运算方法：
         * BigDecimal divide(BigDecimal divisor,int scale,int roundingMode) :
         *     divesor：此 BigDecimal 要除以的值。
         *     scale：保留的位数
         *     roundingMode：舍入方式
         * 舍入方式：BigDecimal类提供静态的成员变量来表示舍入的方式
         *     BigDecimal.ROUND_UP 向上加1。
         *     BigDecimal.ROUND_DOWN 直接舍去。
         *     BigDecimal.ROUND_HALF_UP 四舍五入。
         */
        //除,保留后两位,四舍五入
        BigDecimal divide = bigDecimal1.divide(bigDecimal2, 2, BigDecimal.ROUND_HALF_UP);

        System.out.println(add);
        System.out.println(subtract);
        System.out.println(multiply);
        System.out.println(divide);
    }
}
