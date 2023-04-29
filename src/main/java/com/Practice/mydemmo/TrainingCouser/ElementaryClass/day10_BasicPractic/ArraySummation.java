package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

/**
 * 数组求和
 * 有这样的一个数组，元素是{68,27,95,88,171,996,51,210}。求出该数组中满足要求的元素和， 要求 是：求和的元素个位和十位都不能是7，并且只能是偶数
 */
public class ArraySummation {
    public static void main(String[] args) {
        int sumNum = 0;
        int arr[] = {68, 27, 95, 88, 171, 996, 51, 210};
        for (int num : arr) {
            if (num % 10 != 7 && num / 10 % 10 != 7 && num % 2 == 0) {
                sumNum += num;
            }
        }
        System.out.println("sumNum:" + sumNum);
    }
}
