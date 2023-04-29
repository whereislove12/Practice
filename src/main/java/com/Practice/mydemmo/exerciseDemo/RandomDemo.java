package com.Practice.mydemmo.exerciseDemo;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * @Author 贾文浩
 * @Date 2022 10 20 15 07
 **/

public class RandomDemo {
    @Test
    public void randomDemo01(){
        System.out.println(new Random().nextInt(2)+4);
    }
}
