package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day3_Operator;

import java.util.Scanner;

/**
 * 数据输入
 */
public class ScannerDemo {
    public static void main(String[] args) {
        System.out.println("请输入内容,输入 'quit' 退出");
        while (true) {
            String nextLine = new Scanner(System.in).nextLine();
            if ("quit".endsWith(nextLine)) {
                System.out.println("已退出");
                break;
            }
            System.out.println("本次输入的内容是:" + nextLine);
        }
    }
}
