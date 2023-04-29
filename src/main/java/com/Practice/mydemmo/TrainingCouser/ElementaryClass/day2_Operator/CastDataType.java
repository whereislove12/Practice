package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day2_Operator;

import org.junit.jupiter.api.Test;

/**
 * 强制转换数据类型
 *
 * 强制类型转换：将取值范围大的类型 强制转换成取值范围小的类型
 *
 * 从底到高,自动转换
 *
 * 从高到低,先转换为二进制,然后从右向左截取转换后的数据类型对应的长度,再转换为十进制
 *
 * ASC码表:
 * 0 48
 * 0 57
 * A 65
 * Z 90
 * a 97
 * z 122
 */
public class CastDataType {
    @Test
    public void cast1() {
        int a = 1000000000;
        float b = a;
        System.out.println(a + "---" + b);
    }

    @Test
    public void cast2() {
        int a = 50;
        byte b = (byte) a;
        System.out.println(a + "---" + b);
    }

    /**
     * double 小数点后最多15位
     * float 小数点后最多7位
     */
    @Test
    public void cast3() {
        double a = 3.14123;
        float b = (float) a;
        System.out.println(a + "---" + b);
    }

    /**
     * 精度会丢失
     */
    @Test
    public void cast4() {
        double a = 3.14;
        int b = (int) a;
        System.out.println(a + "---" + b);
    }
}
