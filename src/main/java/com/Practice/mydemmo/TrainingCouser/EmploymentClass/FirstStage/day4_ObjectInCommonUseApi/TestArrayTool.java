package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestArrayTool {
    @Test
    public void testBubbleSort() {
        int arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        ArrayTool.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testChoiceSort() {
        int arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        ArrayTool.ChoiceSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testBinarySearch() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 56, 233, 86};

        int index1 = ArrayTool.binarySearch(arr, 7);
        int index2 = ArrayTool.binarySearch(arr, 8);
        System.out.println(index1);
        System.out.println(index2);
    }

    @Test
    public void testArraysSortAsc() {
        int arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 使用自定义排序,数字里面不允许使用基本数据类型
     */
    @Test
    public void testArraySortDesc1() {
        Integer arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testArraySortDesc2() {
        Integer arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    /**
     * lambda表达式写法
     */
    @Test
    public void testArraySortDesc3() {
        Integer arr[] = {9, 5, 7, 6, 2, 3, 1, 4, 56, 233, 86};
        Arrays.sort(arr, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void testArraysBinarySearch() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 9, 56, 233, 86};
        int index1 = Arrays.binarySearch(arr, 7);
        int index2 = Arrays.binarySearch(arr, 8);
        System.out.println(index1);
        System.out.println(index2);
    }
}
