package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day11_IOStream.MethodRecursion;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Objects;

/**
 * 方法递归
 */
public class MethodRecursion {
    /**
     * 测试 1 ~ n求和
     */
    @Test
    public void testSumOneToN() {
        Integer summed = sumOneToN(5);
        System.out.println(summed);
    }

    /**
     * 测试地柜求阶乘
     */
    @Test
    public void testFactorialRecursion() {
        System.out.println(factorialRecursion(5));
    }

    @Test
    public void testFileErgodic(){
        FileErgodic("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day11_IOStream");
    }

    /**
     * 1 ~ n 求和
     */
    public Integer sumOneToN(int num) {
        if (num == 1) {
            return 1;
        }
        return sumOneToN(num - 1) + num;
    }

    /**
     * 地柜求阶乘
     */
    public Integer factorialRecursion(int num) {
        if (num == 1) {
            return 1;
        }
        return num * factorialRecursion(num - 1);
    }

    /**
     * 遍历文件目录
     */
    public void FileErgodic(String filePath) {
        FileErgodicJob(new File(filePath), "");

    }

    private void FileErgodicJob(File file, String blank) {
        if (!file.exists()) {
            return;
        }
        System.out.println(blank + file.getName());
        blank += "-";
        File[] files = file.listFiles();
        if (Objects.nonNull(files)) {
            for (File childFile : files) {
                FileErgodicJob(childFile, blank);
            }
        }
    }
}
