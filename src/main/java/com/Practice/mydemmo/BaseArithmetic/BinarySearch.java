package com.Practice.mydemmo.BaseArithmetic;

public class BinarySearch {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 4, 5, 6, 7, 12, 32, 435, 2312, 4332, 3456, 5678};
//        Integer index = getIndex(nums, 32);
        Integer index = getIndex(nums, 32);
        System.out.println(index);
    }

    public static Integer getIndex(Integer[] nums, int num) {
        int starIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex = 0;

        while (endIndex > starIndex) {
            middleIndex = (starIndex + endIndex) / 2;
            if (nums[middleIndex] > num) {
                starIndex = middleIndex - 1;
            } else if (nums[middleIndex] < num) {
                endIndex = middleIndex + 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    public static int getIndex(int[] arr, int select_value) {
        //初始化最小值的索引为0
        int left = 0;
        //初始化最大值的索引为arr.length-1
        int right = arr.length - 1;
        //首尾相加再除以2得出中间索引
        int mid = (left + right) / 2;

        while (left <= right) { //确保程序不会重复查询，不会越界
            if (select_value > arr[mid]) {
                //如果查询的值比中间值大，则往右边区域找，就把最小索引改为中间索引右移一位
                left = mid + 1;
            } else if (select_value < arr[mid]) {
                //如果查询的值比中间值小，则往左边区域找，就把最大索引改为中间索引左移一位
                right = mid - 1;
            } else {
                //剩余的情况就是查询到了结果，那么就直接返回索引。
                return mid;
            }
            mid = (left + right) / 2;
        }
        //没有查询到，则返回-1
        return -1;
    }
}
