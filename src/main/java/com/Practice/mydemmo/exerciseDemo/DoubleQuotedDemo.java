package com.Practice.mydemmo.exerciseDemo;

import java.util.Scanner;

/**
 * @Author 贾文浩
 * @Date 2022 11 02 09 18
 **/

public class DoubleQuotedDemo {
    public static void main(String[] args) {
        String input = new Scanner(System.in).next();
        if (input.startsWith("\"") && input.endsWith("\"")) {
            String substring = input;
            if (input.length() > 2) {
                substring = input.substring(1, input.length() - 1);
            }
            if (!substring.contains("\"") && null != substring){
                System.out.println(true);
            }
            System.out.println(false);
        } else {
            System.out.println(false);
        }
    }
}
