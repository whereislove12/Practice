package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day9_MethodOverload;

import org.junit.jupiter.api.Test;

/**
 * 方法参数传递引用类型
 */
public class MethodArgumentsPassTheReferenceType {
    private int[] arr = {1, 2, 3, 4, 5, 9, 8, 7, 6};

    @Test
    public void test1() {
        try {
            changeNum(arr, 2, 19);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        printArray(arr);
    }

    @Test
    public void test2() {
        printMax(arr);
    }

    public void printMax(int arr[]) {
        int maxNum = 0;
        for (int i : arr) {
            maxNum = maxNum > i ? maxNum : i;
        }
        System.out.println(maxNum);
    }

    private static void changeNum(int arr[], int index, int newNum) throws Exception {
        if (index > arr.length - 1) {
            throw new Exception("索引越界");
        }
        arr[index] = newNum;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i]);
            }
        }
    }
}
