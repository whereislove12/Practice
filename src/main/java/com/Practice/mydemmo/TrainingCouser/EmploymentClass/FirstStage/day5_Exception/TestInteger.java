package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day5_Exception;

import org.junit.jupiter.api.Test;

public class TestInteger {
    @Test
    public void test1() {
        /**
         * 自动装箱
         */
        Integer num = 5;

        /**
         * 自动拆箱
         */
        num += 5;

        System.out.println(num);
    }

    @Test
    public void test2() {
        Integer num1 = Integer.valueOf("15");

        //jdk 9 之后不推荐这么使用
        Integer num2 = new Integer("25");

        System.out.println(num1);
        System.out.println(num2);
    }

    /**
     * 除了Character类之外，其他所有包装类都具有parseXxx静态方法可以将字符串参数转换为对应的基本类型：
     * public static byte parseByte(String s) ：将字符串参数转换为对应的byte基本类型。
     * public static short parseShort(String s) ：将字符串参数转换为对应的short基本类型。
     * public static int parseInt(String s) ：将字符串参数转换为对应的int基本类型。
     * public static long parseLong(String s) ：将字符串参数转换为对应的long基本类型。
     * public static float parseFloat(String s) ：将字符串参数转换为对应的float基本类型。
     * public static double parseDouble(String s) ：将字符串参数转换为对应的double基本类型。
     * public static boolean parseBoolean(String s) ：将字符串参数转换为对应的boolean基本类型。
     */
    @Test
    public void test3() {
        int parseNum = Integer.parseInt("33333");
        System.out.println(parseNum);
    }
}
