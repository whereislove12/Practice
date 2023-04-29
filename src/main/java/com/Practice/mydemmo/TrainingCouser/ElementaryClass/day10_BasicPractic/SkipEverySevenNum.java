package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import org.junit.jupiter.api.Test;

/**
 * 逢七必过
 * 1-100 之间的数字,包含 7 或者是 7 的倍数的数字不输出
 */
public class SkipEverySevenNum {
    @Test
    public void test1() {
        int arr[] = new int[100];
        for (int i = 1; i <= 100; i++) {
            arr[i - 1] = i;
        }
        printSkipNum(arr);
    }

    private void printSkipNum(int arr[]) {
        for (int num : arr) {
            int unitsDigit = num % 10;
            int tensDigit = num / 10 % 10;
            int hundredsDigit = num / 100 % 10;
            if (unitsDigit == 7 || tensDigit == 7 || hundredsDigit == 7 || num % 7 == 0) {
                System.out.println("跳过,跳过的数字是:" + num);
            } else {
                System.out.println(num);
            }
        }
    }
}
