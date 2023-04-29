package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day12_IOStream;

import org.junit.jupiter.api.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TestIO4 {
    /**
     * 转换流 + 打拼刘输出内容,开启续写功能
     *
     * @throws IOException
     */
    @Test
    public void test1() throws IOException {

        PrintWriter printWriter = new PrintWriter(
                new OutputStreamWriter(
                        new FileOutputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day12_IOStream\\Files\\b.txt"
                                , true)
                        , "UTF-8"
                ), true);

        printWriter.write(System.currentTimeMillis() + "");
        printWriter.println();
        printWriter.flush();
        printWriter.close();
    }
}
