package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day1_BaseGrammar;

import org.junit.jupiter.api.Test;

/**
 * 常量
 */
public class ConstantDemo {

    @Test
    public void printConstant1() {
        System.out.println(0);
        System.out.println(true);
        System.out.println('a');
        System.out.println(3.14);
        System.out.println(3.14f);
        System.out.println(123123l);
        System.out.println((byte) 1);
        System.out.println((short) 1);
        //字符常量只能有一字符
        //System.out.println('ab');
        //两个单引号中间必须有且仅有一个字符
        //System.out.println('');
    }
}