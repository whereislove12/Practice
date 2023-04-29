package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day10_BasicPractic;

import java.util.Scanner;

/**
 * 评委打分
 * 在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。 选手的最后得分为：去掉一个 最高分和一个最低分后 的4个评委平均值 (不考虑小数部分)。
 */
public class JudgingGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一组评委的分数,共六位评委打分,分值范围 : 1-100, 格式为: '85,75,90,65,70,95'");
        String nextLine = scanner.nextLine();
        String[] numsStr = nextLine.split(",");
        if (numsStr.length>6){
            System.out.println("分数数量超过限制,只有6个评委");
            return;
        }

        int[] scores = new int[6];
        for (int i = 0; i < numsStr.length; i++) {
            try {
                scores[i] = Integer.valueOf(numsStr[i]);
            } catch (NumberFormatException e) {
                System.out.println("分数输入格式有误");
                break;
            }
        }

        judging(scores);
    }

    private static void judging(int scoreArr[]) {
        sortArr(scoreArr);
        int cacheNum = 0;
        for (int i = 1; i < scoreArr.length - 1; i++) {
            cacheNum += scoreArr[i];
        }
        System.out.println("选手最终得分为:" + (cacheNum / (scoreArr.length - 2)));
    }

    private static void sortArr(int arr[]) {
        int cacheNum;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[i] < arr[j]) {
                    cacheNum = arr[i];
                    arr[i] = arr[j];
                    arr[j] = cacheNum;
                }
            }
        }
    }
}
