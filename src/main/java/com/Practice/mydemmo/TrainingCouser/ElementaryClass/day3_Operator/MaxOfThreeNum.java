package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day3_Operator;

import java.util.Scanner;

/**
 * 计算录入的三个数字的最大值
 */
public class MaxOfThreeNum {
    public static void main(String[] args) throws Exception {
        System.out.println("请依次输入三个数字来对比大小");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        try {
            System.out.println("请输入第一个数字");
            a = scanner.nextInt();

            System.out.println("请输入第二个数字");
            b = scanner.nextInt();

            System.out.println("请输入第三个数字");
            c = scanner.nextInt();


            int maxNum = a > b ? a : b;
            maxNum = maxNum > c ? maxNum : c;
            System.out.println("三个数字中最大的数字是:" + maxNum);
        } catch (Exception e) {
            System.out.println("请输入长度小于10位的整数");
        }
    }
}
