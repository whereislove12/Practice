package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.ClassLoader;

import org.junit.Test;

/**
 * 所有的类加载器都是 java.lang.ClassLoader 的子类
 * 使用 :
 * 类.class.getClassLoader() 获得加载自己的类加载器
 * 类加载器加载机制：
 * 全盘负责:A类如果要使用B类（不存在），A类加载器必须负责加载B类。
 * 委托机制:A类加载器如果要加载资源B，必须询问父类加载是否加载。 如果加载，将直接使用。 如果没有机制，自己再加载。
 * 采用全盘负责委托机制保证一个class文件只会被加载一次，形成一个Class对象。
 */
public class ClassLoaderIntroduction2 {
    @Test
    public void testClassLoader(){
        ClassLoader classLoader1 = this.getClass().getClassLoader();
        System.out.println(classLoader1);

        System.out.println(classLoader1.getParent());

        System.out.println(classLoader1.getParent().getParent());
    }

    ////引导类加载器,不是类,JVM内部,返回值null
    @Test
    public void testGetClassLoader2(){
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println(classLoader);
    }
}
