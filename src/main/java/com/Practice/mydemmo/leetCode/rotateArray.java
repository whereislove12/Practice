package com.Practice.mydemmo.leetCode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

//旋转数组
//给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
///示例 1:
//
//输入: nums = [1,2,3,4,5,6,7], k = 3
//输出: [5,6,7,1,2,3,4]
//解释:
//向右轮转 1 步: [7,1,2,3,4,5,6]
//向右轮转 2 步: [6,7,1,2,3,4,5]
//向右轮转 3 步: [5,6,7,1,2,3,4]
//示例2:
//
//输入：nums = [-1,-100,3,99], k = 2
//输出：[3,99,-1,-100]
//解释: 
//向右轮转 1 步: [99,-1,-100,3]
//向右轮转 2 步: [3,99,-1,-100]
public class rotateArray {
    @Test
    public void test01() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] rotate = rotate(nums, 8);

        System.out.println(Arrays.toString(rotate));
    }

    @Test
    public void test02() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] rotate = rotateImage(nums, 9);

        System.out.println(Arrays.toString(rotate));
    }

    public int[] rotate(int[] nums, int k) {
        k %= nums.length;
        int[] newNums = new int[nums.length];
        //后移的数字
        for (int i = 0; i < nums.length - k; i++) {
            newNums[i + k] = nums[i];
        }
        //后面的逐渐前移
        for (int j = 0; j < k; j++) {
            newNums[j] = nums[nums.length - k + j];
        }
        return newNums;

    }

    public int[] rotateImage(int[] nums, int k) {
        k %= nums.length;
        int[] newNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }

        //后移的数字
        for (int i = 0; i < nums.length - k; i++) {
            nums[i + k] = newNums[i];
        }
        //后面的逐渐前移
        for (int j = 0; j < k; j++) {
            nums[j] = newNums[nums.length - k + j];
        }
        return nums;
    }

    public void rotateDemo(int[] nums, int k) {
        int len=nums.length;
        k %=len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}
