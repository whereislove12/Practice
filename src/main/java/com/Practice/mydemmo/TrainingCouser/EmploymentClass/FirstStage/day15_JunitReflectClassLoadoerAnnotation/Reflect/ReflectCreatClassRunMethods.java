package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * 模拟框架,创建任意对象,执行任何方法
 */
public class ReflectCreatClassRunMethods {
    @Test
    public void test() throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //加载配置文件
        Properties properties = new Properties();
        properties.load(new FileReader("src\\main\\java\\com\\Practice\\mydemmo\\TrainingCouser\\EmploymentClass\\FirstStage\\day15_JunitReflectClassLoadoer\\Reflect\\config.properties"));
        String className = properties.getProperty("className");
        //反射创建对象
        Class<?> aClass = Class.forName(className);
        Object clazz = aClass.newInstance();
        System.out.println("生成的对象是:" + clazz);
        //反射执行方法
        String method = properties.getProperty("method");
        aClass.getMethod(method).invoke(clazz);
    }
}
