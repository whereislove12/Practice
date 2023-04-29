package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

public class ArrayTool {
    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void bubbleSort(int arr[]) {
        int cacheNum;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    cacheNum = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = cacheNum;
                }
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void ChoiceSort(int[] arr) {
        int cacheNum;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    cacheNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = cacheNum;
                }
            }
        }
    }

    /**
     * 二分查找
     *
     * @param arr
     * @param num
     * @return
     */
    public static int binarySearch(int arr[], int num) {
        int starIndex = 0;
        int endIndex = arr.length - 1;
        int middleIndex = 0;
        while (starIndex <= endIndex) {
            middleIndex = (starIndex + endIndex) / 2;
            if (num > arr[middleIndex]) {
                starIndex = middleIndex + 1;
            } else if (num < arr[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
