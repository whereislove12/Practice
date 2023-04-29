package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import java.util.Scanner;

/**
 * 查找元素在数组中出现的索引位置
 * 已知一个数组 arr = {19, 28, 37, 46, 50}; 键盘录入一个数据，查找该数据在数组中的索引。 并在控制台输出找到的索引值。如果没有查找到，则输出-1
 */
public class FindIndexInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字,数组中如果有输入的数字会返回索引,否则返回-1");
        int inputNum = scanner.nextInt();
        int arr[] = {19, 28, 37, 46, 50};
        int index = binarySearch(arr, inputNum);
        System.out.println(index);
    }

    private static int binarySearch(int arr[], int num) {
        int middleIndex;
        int starIndex = 0;
        int endIndex = arr.length - 1;
        if (arr.length == 0) {
            return -1;
        }
        while (true) {
            if (starIndex > endIndex) {
                return -1;
            }
            middleIndex = (starIndex + endIndex) / 2;
            if (num > arr[middleIndex]) {
                starIndex = middleIndex + 1;
            } else if (num < arr[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
    }
}
