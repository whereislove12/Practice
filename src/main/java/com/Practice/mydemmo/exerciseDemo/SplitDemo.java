package com.Practice.mydemmo.exerciseDemo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @Author 贾文浩
 * @Date 2022 11 15 00 18
 **/

public class SplitDemo {
    @Test
    public void test01(){
        String text = "A";
        String[] split = text.split("");
        List<String> strings = Arrays.asList(split);
        System.out.println(strings);
    }
}
