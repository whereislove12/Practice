package com.Practice.mydemmo.exerciseDemo;

import org.junit.jupiter.api.Test;

public class RecursionDemo {

    @Test
    public void test01(){

        System.out.println(recursion(3));    }

    public static Integer recursion(Integer num){

        if (num>1){
            return num * recursion(num-1);
        }else {
            return 1;
        }
    }
}
