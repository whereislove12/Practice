package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.ClassLoader;

/**
 * 类的加载:
 * 当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过 加载，连接，初始化 三步来实现对这个类进 行初始化。
 * 加载 :
 * 就是指将class文件读入内存，并为之创建一个Class对象。
 * 任何类被使用时系统都会建立一个Class对象
 * 连接 :
 * 验证是否有正确的内部结构，并和其他类协调一致 准备负责为类的静态成员分配内存，并设置默认初始化值
 * 解析将类的二进制数据中的符号引用替换为直接引用
 * ***************************************************************************************************************
 * 类的初始化:
 * 1. 创建类的实例
 * 2. 类的静态变量，或者为静态变量赋值
 * 3. 类的静态方法
 * 4. 使用反射方式来强制创建某个类或接口对应的java.lang.Class对象
 * 5. 初始化某个类的子类
 * 6. 直接使用java.exe命令来运行某个主类
 * ***************************************************************************************************************
 * 类加载器：
 * 类加载器是负责加载类的对象。将class文件（硬盘）加载到内存生成Class对象。
 * 类加载器分类:
 * 1.BootstrapClassLoader 根类加载器:
 * 也被称为引导类加载器，负责Java核心类的加载 比如System,String等。
 * 2.ExtClassLoader 扩展类加载器:
 * 负责JRE的扩展目录中jar包的加载。 在JDK中JRE的lib目录下ext目录
 * 3.AppClassLoader 系统类加载器:
 * 负责在JVM启动时加载来自java命令的class文件，以及classpath环境变量所指定的jar包和类路径。
 */
public class ClassLoaderIntroduction1 {
}
