package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day8_Map;

import org.junit.jupiter.api.Test;

/**
 * 可变参数
 * 格式：
 * 修饰符 返回值类型 方法名(参数类型... 形参名){ }
 * 注意：
 * 可变参数的本质是数组。
 * 不传递参数，数组的长度是0.
 * 传递几个参数，数组的长度就是几。
 * 一个方法中只能有一个可变参数。
 * ***如果方法中有多个参数，可变参数只能写在最后一位。***
 */
public class VariableParameter {
    @Test
    public void test1(){
        int arr[] = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
    }

    public static void printArray(int... arr){
        if (!(arr.length>0)){
            System.out.println("输入参数为空");
        }
        else {
            for (int i : arr) {
                System.out.println(i);
            }
        }
    }
}
