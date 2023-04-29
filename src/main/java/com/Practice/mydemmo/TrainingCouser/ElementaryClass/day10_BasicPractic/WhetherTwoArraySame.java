package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * 两数组是否相同
 */
public class WhetherTwoArraySame {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7,9,13,23,43,13,32,43,13,2,3,1,3,424,2,3,21};
        int arr2[] = {1,4,5,7,9,13,23,43,13,32,43,13,2,3,1,3,424,2,3,21};
        boolean result = judgeTwoArraySimple(arr1, arr2);
        System.out.println(result);
    }

    /**
     * 判断数组是否相同
     * @param arr1
     * @param arr2
     * @return
     */
    private static boolean judgeTwoArraySimple(int[] arr1, int arr2[]) {
        boolean flag = true;
        if (arr1.length != arr2.length) {
            flag = false;
        }
        sortArray(arr1);
        sortArray(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]){
                flag = false;
                break;
            }
        }

        return flag;
    }

    /**
     * 排序
     * @param arr
     */
    private static void sortArray(int arr[]) {
        int num;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
    }

    @Test
    public void testSortArray(){
        int arr[] = {2,3,1,42,3,12,324,3,12};
        sortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
