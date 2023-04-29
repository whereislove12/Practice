package com.Practice.mydemmo.BaseArithmetic;

import java.util.Arrays;

public class ChoseSort {
    public static void main(String[] args) {
        Integer[] nums = {1, 3, 2, 4, 5, 8, 0, 6};
        sortNums(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static Integer[] sortNums(Integer[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    flag = nums[i];
                    nums[i] = nums[j];
                    nums[j] = flag;
                }
            }
        }
        return nums;
    }
}
