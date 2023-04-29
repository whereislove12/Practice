package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day2_Operator;

import org.junit.jupiter.api.Test;

/**
 * 数据类型转换
 */
public class DataTypeConversion {
    /**
     * 自动转换：将取值范围小的类型 自动提升为取值范围大的类型 。
     *
     * 转换规则
     * byte、short、char-->int-->long-->float-->double
     *
     * byte -> short ->  \
     *                      int  ->  long  ->  float  ->  double
     *         char  ->  /
     */
    @Test
    public void conversion1() {
        int a = 10;
        short b = 3;
        byte c = 100;
        int d = a + b + c;
        System.out.println(d);
    }
}
