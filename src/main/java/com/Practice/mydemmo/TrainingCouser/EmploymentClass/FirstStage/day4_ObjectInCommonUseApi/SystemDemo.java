package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Arrays;

public class SystemDemo {
    @Test
    public void test1() {
        long currentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");

        System.out.println(simpleDateFormat.format(currentTimeMillis));
    }

    @Test
    public void test2() {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //System.arraycopy(arr1,2, arr2, 0, arr1.length - 2);
        //System.arraycopy(arr1,0, arr2, 2, arr1.length - 2);
        System.arraycopy(arr1, 0, arr2, 0, arr1.length);
        System.out.println(Arrays.toString(arr2));
    }

    /**
     * 终止当前运行的 Java 虚拟机，非零表 示异常终止
     */
    @Test
    public void test3() {
        System.exit(0);
    }

    /**
     * 运行垃圾回收
     */
    @Test
    public void test4() {
        System.gc();
    }
}
