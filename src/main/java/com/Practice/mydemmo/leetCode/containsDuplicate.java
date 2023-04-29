package com.Practice.mydemmo.leetCode;

import java.util.HashSet;

//存在重复元素
//给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false
public class containsDuplicate {
    public static void main(String[] args) {

    }

    public boolean containsDuplicate1(int[] nums) {
        //先排序
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = flag;
                }
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate2(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if (!numsSet.add(num)) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate3(int[] nums) {
        int[] sign = new int[nums.length];
        int n;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i] % nums.length;
            if (n < 0) n += nums.length;
            sign[n]++;
            if (sign[n] > 1)
                for (int j = 0; j < i; j++)
                    if (nums[i] == nums[j])
                        return true;

        }
        return false;
    }

    public boolean containsDuplicate4(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
