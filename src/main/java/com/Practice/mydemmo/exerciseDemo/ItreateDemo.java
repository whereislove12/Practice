package com.Practice.mydemmo.exerciseDemo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * @Author 贾文浩
 * @Date 2022 09 27 16 18
 **/

public class ItreateDemo {

    @Test
    public void test01(){
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("张三","李四","王五"));
        Iterator<String> iterator = strings.iterator();
        String next = iterator.next();
        iterator.remove();
        System.out.println(strings);
    }
}
