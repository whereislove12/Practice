package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day4_SelectStructure;


import java.util.Scanner;

/**
 * 选择结构
 */
public class SelectiveStructure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择服务种类:" +
                    "1:吃喝" +
                    "2:玩乐" +
                    "3:养生");
            int a, b;
            a = scanner.nextInt();
            if (1 == a) {
                System.out.println("请选择套餐:" +
                        "1:汉堡套餐" +
                        "2:盖饭" +
                        "3:麻辣烫");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("这是汉堡套餐");
                        break;
                    case 2:
                        System.out.println("这是盖饭");
                        break;
                    case 3:
                        System.out.println("这是麻辣烫");
                        break;
                    default:
                        System.out.println("暂未开放");
                        break;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (2 == a) {
                System.out.println("请选择套餐:" +
                        "1:大保健" +
                        "2:麻将馆" +
                        "3:旅游");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("请享受大保健服务");
                        break;
                    case 2:
                        System.out.println("欢迎来麻将馆玩耍");
                        break;
                    case 3:
                        System.out.println("欢迎来旅游");
                        break;
                    default:
                        System.out.println("暂未开放");
                        break;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else if (3 == a) {
                System.out.println("请选择养生项目:" +
                        "1:洗洗睡" +
                        "2:坐着发呆" +
                        "3:逛该");
                b = scanner.nextInt();
                switch (b) {
                    case 1:
                        System.out.println("洗洗睡吧");
                        break;
                    case 2:
                        System.out.println("可以开始发呆了");
                        break;
                    case 3:
                        System.out.println("出来遛弯吧");
                        break;
                    default:
                        System.out.println("暂未开放");
                        break;
                }
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("暂未开放,退出系统");
                break;
            }
        }
    }
}
