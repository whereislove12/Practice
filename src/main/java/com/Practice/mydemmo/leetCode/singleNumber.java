package com.Practice.mydemmo.leetCode;

//只出现一次的数字
//给你一个 非空 整数数组 nums ，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
//
//你必须设计并实现线性时间复杂度的算法来解决此问题，且该算法只使用常量额外空间。
public class singleNumber {
    public static void main(String args[]) {
        int[] nums = {1, 2, 3, 3, 2, 4, 4, 5, 5, 6, 6, 7, 8, 1, 8};
        int i = singleNumber(nums);
        System.out.println(i);
    }

    public static int singleNumber(int[] nums) {
        int flag = 0;
        for (int num : nums) {
            flag ^= num;
        }
        return flag;
    }
}
