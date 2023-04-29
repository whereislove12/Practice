package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day13_PropertiesLambdaStream.Properties;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/**
 * Properties类
 * 构造方法 :
 * public Properties() :创建一个空的属性列表。
 * 与流相关的方法:
 * public void load(InputStream inStream) ： 从字节输入流中读取键值对。
 * public void load(Reader reader) ： 从字符输入流中读取键值对。
 */
public class PropertiesDemo {
    @Test
    public void test1() throws IOException {
        Properties properties = new Properties();
        properties.load(
                new FileInputStream("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day13_Lambda\\Properties\\configDemo.properties"));
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String propertyName : propertyNames) {
            System.out.println(propertyName + ":" + properties.getProperty(propertyName));
        }
    }

    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        properties.load(
                new FileReader("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day13_Lambda\\Properties\\configDemo.properties"));
        Set<String> propertyNames = properties.stringPropertyNames();
        for (String propertyName : propertyNames) {
            System.out.println(propertyName + ":" + properties.getProperty(propertyName));
        }
    }
}
