package com.Practice.mydemmo.exerciseDemo;

import org.junit.jupiter.api.Test;

public class MathMethods {
    public static void main(String[] args) {
        long round = Math.round(-11.3);
        System.out.println(round);
    }

    @Test
    public void test01() {
        int x = 2;
        System.out.println((++x) * 3 % 9);
    }
}
