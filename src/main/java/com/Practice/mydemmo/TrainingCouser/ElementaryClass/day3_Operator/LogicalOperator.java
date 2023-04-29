package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day3_Operator;

import org.junit.jupiter.api.Test;

/**
 * 逻辑运算符
 */
public class LogicalOperator {
    @Test
    public void operator1() {
        int a = 3;
        int b = 5;
        int c = 7;
        /**
         * 或 只要表达式中有一个值为true，结果即为true
         * 二进制数字运算,只要有 1 就为 1
         */
        //| 逻辑或|，无论左边真假，右边都要执行。
        System.out.println((a > b) | (b < c));  //true
        System.out.println((a > b) | (b > c));  //false
        System.out.println((a < b) | (b < c));  //true
        System.out.println("---------------------------------");
        //|| 短路或||，如果左边为假，右边执行；如果左边为真，右边不执行。
        System.out.println((a > b) || (b < c)); //true
        System.out.println((a > b) || (b > c)); //false
        System.out.println((a < b) || (b < c)); //true
        System.out.println("---------------------------------");
        /**
         * 与 只要表达式中有一个值为false，结果即为false
         * 二进制数字运算,只有两个都为 1 ,才为 1
         */
        //& 逻辑与&，无论左边真假，右边都要执行。
        System.out.println((a > b) & (b < c));  //false
        System.out.println((a > b) & (b > c));  //false
        System.out.println((a < b) & (b < c));  //true
        System.out.println("---------------------------------");
        //&&
        System.out.println((a > b) && (b < c)); //false
        System.out.println((a > b) && (b > c)); //false
        System.out.println((a < b) && (b < c)); //true
        System.out.println("---------------------------------");
        /**
         * ! 非,取反
         * 二进制数字,位数为 0 ,结果是 1;位数为 1 ,结果为 0
         */
        System.out.println(!(a < b));   //false
        System.out.println("---------------------------------");
        /**
         * ^ 异或,相同为false，不同为true
         * 二进制数字运算,相同为 0 ,不同为 1
         */
        System.out.println((a ^ b) ^ a);    //5
        System.out.println((a > b) ^ (a > c)); //false ^ false,输出false
        System.out.println((a < b) ^ (a > c)); //true ^ false,输出true
        System.out.println((a > b) ^ (a < c)); //false ^ true,输出true
        System.out.println((a < b) ^ (a < c)); //true ^ true,输出false
        System.out.println("---------------------------------");
    }
}
