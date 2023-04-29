package com.Practice.mydemmo.leetCode;

import java.util.ArrayList;
import java.util.Arrays;

//两个数组的交集 II
//给你两个整数数组nums1 和 nums2 ，请你以数组形式返回两数组的交集。返回结果中每个元素出现的次数，
// 应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。可以不考虑输出结果的顺序。

public class ArraysIntersection {

    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        ArrayList<Integer> numList = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                numList.add(nums1[i]);
                j++;
                i++;
            }
        }
        int[] nums = new int[numList.size()];
        for (int l = 0; l < numList.size(); l++) {
            nums[l] = numList.get(l);
        }
        return nums;
    }
}
