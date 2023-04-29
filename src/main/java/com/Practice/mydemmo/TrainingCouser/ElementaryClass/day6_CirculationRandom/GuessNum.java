package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day6_CirculationRandom;

import java.util.Random;
import java.util.Scanner;

/**
 * 需求：程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？ 效果：
 * 如果猜的数字比真实数字大，提示你猜的数据大了 如果猜的数字比真实数字小，提示你猜的数据小了
 * 如果猜的数字与真实数字相等，提示恭喜你猜中了
 */
public class GuessNum {
    public static void main(String[] args) {
        int num = new Random().nextInt(100) + 1;
        System.out.println("请猜测本次随机的 1-100 之间的数字");

        int inputNum;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            inputNum = scanner.nextInt();
            if (inputNum > num) {
                System.out.println("猜大了");
            } else if (inputNum < num) {
                System.out.println("猜小了");
            } else {
                break;
            }
        }
        System.out.println("恭喜猜中了,正确答案是:" + inputNum + ",随机数是:" + num);
    }
}
