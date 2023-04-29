package com.Practice.mydemmo.BaseArithmetic;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        Integer[] nums = {9,8,2,6,4,5,3,7,1};
        sortNums(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static Integer[] sortNums(Integer[] nums) {
        int flage = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    flage = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = flage;
                }
            }
        }
        return nums;
    }
}
