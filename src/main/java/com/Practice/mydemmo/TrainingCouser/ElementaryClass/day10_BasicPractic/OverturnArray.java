package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 数组元素反转
 */
public class OverturnArray {
    @Test
    public void test1(){
        int[] arr = {1,2,3,4,5,6,7};
        overturnArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void overturnArray(int arr[]) {
        int cacheNum;
        int middleIndex = (arr.length - 1) / 2;

        for (int i = 0; i < middleIndex; i++) {
            cacheNum = arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i];
            arr[i] = cacheNum;
        }
    }
}
