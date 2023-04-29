package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day4_SelectStructure;

import java.util.Scanner;

/**
 * 选择结构2
 *
 * switch 中 case 具有穿透性,所以要写break结束
 */
public class SelectiveStructure2 {
    public static void main(String[] args) {
        System.out.println("输入月份输出季节");
        int intNum = new Scanner(System.in).nextInt();
        switch (intNum) {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
        }
    }
}
