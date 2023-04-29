package com.Practice.mydemmo.leetCode;

import org.junit.jupiter.api.Test;

//删除排序数组中的重复项
//给你一个 升序排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。
//由于在某些语言中不能改变数组的长度，所以必须将结果放在数组nums的第一部分。更规范地说，如果在删除重复项之后有 k 个元素，那么nums的前 k 个元素应该保存最终结果。
//
//将最终结果插入nums 的前 k 个位置后返回 k 。
//
//不要使用额外的空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

/**
 * 思路:可以设置一个索引来判断当前元素和下一个是否相同,就躺索引停留,直到找到下一个不同元素,将不同元素赋值到当前元素的下一位
 */
class RemoveDuplicates {

    @Test
    public void test01() {
        int[] nums = {1, 2, 2, 2, 2, 3, 4, 5, 6, 6, 6, 7, 7, 8, 9, 9, 9};
        int i = removeDuplicatesImage(nums);
        System.out.println(i);
    }

    public int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }


    public int removeDuplicatesImage(int[] nums) {
        //确认后一位是否不同的标记
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            //当标记的位置和第i个位置不同时,标记的下一个位置赋值为i位置的值,不关心i到底在后面哪一位,然后标记前进一位
            if (nums[index] != nums[i]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }

}