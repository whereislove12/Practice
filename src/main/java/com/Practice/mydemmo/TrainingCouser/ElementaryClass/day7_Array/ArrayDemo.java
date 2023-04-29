package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day7_Array;

import org.junit.jupiter.api.Test;

/**
 * 数组
 */
public class ArrayDemo {
    /**
     * 4中创建数组的方式
     */
    @Test
    public void test1() {
        int[] nums1 = new int[10];
        for (int i = 0; i < 10; i++) {
            nums1[i] = i + 1;
        }

        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void test2() {
        int[] nums2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < nums2.length; i++) {
            System.out.print(nums2[i] + " ");
        }
    }

    @Test
    public void test3() {
        int[] nums3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : nums3) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void test4() {
        int nums4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int num : nums4) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void getMaxInArray() {
        int array[] = {1, 3, 6, 3, 42, 3, 43, 13, 567, 45, 23, 13, 234, 646,31,324,231,32,4354,5445,243,13,23,4};
        int max = 0;
        for (int num : array) {
            max = max > num ? max : num;
        }
        System.out.println("最大值是:"+max);
    }
}
