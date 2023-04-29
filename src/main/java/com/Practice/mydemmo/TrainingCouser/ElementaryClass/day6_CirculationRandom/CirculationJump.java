package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day6_CirculationRandom;

import org.junit.jupiter.api.Test;

/**
 * 循环跳转
 */
public class CirculationJump {
    /**
     * 跳出循环
     */
    @Test
    public void test1() {
        for (int i = 0; i < 10; i++) {
            if (i > 5) {
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void test2() {
        int i = 10;
        switch (i) {
            case 1:
                System.out.println(1);
                break;
            case 10:
                System.out.println(10);
                break;
            default:
                System.out.println("no");
                break;
        }
    }

    /**
     * continue 结束本次循环，继续下一次的循环
     */
    @Test
    public void test3() {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    /**
     * 给 for 循环起名字, break 可以指定跳出某个循环
     */
    @Test
    public void test4() {
        out:
        for (int i = 0; i < 10; i++) {
            in:
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    break out;
                }
                System.out.println("i:" + i + "j:" + j);
            }
        }
    }

    /**
     * 使用嵌套循环，打印2021年至2023年月份，格式：xxxx年x月
     */
    @Test
    public void printYearAndMonth() {
        for (int year = 2021; year <= 2023; year++) {
            for (int month = 1; month <= 12; month++) {
                System.out.print(year + "年" + month + "日    ");
            }
            System.out.println();
        }
    }
}
