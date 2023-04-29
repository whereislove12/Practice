package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day6_CirculationRandom;

import org.junit.jupiter.api.Test;

import java.util.Random;

/**
 * 随机数
 */
public class RandomDemo {
    @Test
    public void test1(){
        int i = new Random().nextInt();
        System.out.println(i);
    }

    /**
     * 括号内写 101 ,则随机0-100
     */
    @Test
    public void test2(){
        for (int i = 0; i < 100; i++) {
            int j = new Random().nextInt(101);
            System.out.println(j);
        }
    }
}
