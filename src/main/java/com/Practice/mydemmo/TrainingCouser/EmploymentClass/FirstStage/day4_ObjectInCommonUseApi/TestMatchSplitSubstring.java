package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 测试:
 * 正则表达式+match
 * split
 * substring
 */
public class TestMatchSplitSubstring {
    /**
     * 测试正则表达式
     *
     * @param args
     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入邮箱号码来判断是否符合规范");

            String inputString = new Scanner(System.in).nextLine();
            if ("quit".endsWith(inputString)) {
                break;
            }
            boolean matched = matchEmail(inputString);
            if (matched) {
                System.out.println("输入的邮箱符合规范");
            } else {
                System.out.println("输入的邮箱不符合规范");
            }
        }
    }

    @Test
    public void testSplit() {
        String str = "adnwja,wae,dca,daw,ca,wad.dawd,daw.";
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));
    }

    /**
     * substring 切割,留头不留尾
     */
    @Test
    public void testSubstring() {
        String str = "https://www.baidu.com;https://google.com";
        int index = str.indexOf("com;");
        String substring = str.substring(index + 4, str.length());
        System.out.println(substring);
    }

    /**
     * 判断邮箱是否符合规范
     *
     * @param str
     * @return
     */
    public static boolean matchEmail(String str) {
        String emailRegex = "^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.(com|cn|net)$";
        boolean matches = str.matches(emailRegex);
        return matches;
    }
}