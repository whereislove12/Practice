package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import java.util.Scanner;

/**
 * 减肥计划if版本
 */
public class WeightLossPlanIfVersion {
    public static void main(String[] args) {
        getPlan();
    }

    private static void getPlan() {
        Integer day = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入数字 1-7 来确认当天的减肥计划,输入 'quit' 退出");

            String inputStr = scanner.nextLine();

            if (inputStr.endsWith("quit")) {
                break;
            }
            try {
                day = Integer.valueOf(inputStr);
            } catch (Exception e) {
                System.out.println("输入有误");
                continue;
            }
            if (day < 1 || day > 7) {
                System.out.println("一个星期只有7天");
            } else {
                if (day == 1) {
                    System.out.println("跑步");
                } else if (day == 2) {
                    System.out.println("游泳");
                } else if (day == 3) {
                    System.out.println("动感单车");
                } else if (day == 4) {
                    System.out.println("拳击");
                } else if (day == 5) {
                    System.out.println("慢走");
                } else if (day == 6) {
                    System.out.println("爬山");
                } else {
                    System.out.println("吃肉喝酒");
                }
            }
        }
    }
}
