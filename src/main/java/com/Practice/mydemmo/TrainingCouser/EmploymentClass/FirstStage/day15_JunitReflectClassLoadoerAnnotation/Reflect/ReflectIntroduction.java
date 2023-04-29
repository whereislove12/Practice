package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect;

/**
 * 反射的好处:
 * 1.不需要修改代码,改动的地方都写在配置文件中反射来读取,提高程序灵活性
 * 2.屏蔽掉细节,代码开发更方便
 * 反射的缺点:
 * 执行次数很多的时候系统效率降低
 * ------------------------------------------------------------------------------------------------
 * Class类主要API：
 * 成员变量  - Field
 * 成员方法  - Constructor
 * 构造方法  - Method
 * 获取class文件对象的方式：
 * 1：Object类的getClass()方法                             对象.getClass()    多用于对象的获取字节码方式
 * 2：数据类型的静态属性 class                               类名.class         多用于参数传递
 * 3：Class类中的静态方法：Class ForName(String className)   全类名              多用于配置文件,读取文件,加载类
 * ------------------------------------------------------------------------------------------------
 * 获取成员变量并使用
 * 1: 获取Class对象
 * 2：通过Class对象获取Constructor对象
 * 3：Object obj = Constructor.newInstance()创建对象
 * 4：Field field = Class.getField("指定变量名")获取单个成员变量对象
 * 5：field.set(obj,"") 为obj对象的field字段赋值
 * 如果需要访问私有或者默认修饰的成员变量
 * 1:Class.getDeclaredField()获取该成员变量对象
 * 2:setAccessible() 暴力访问
 * ------------------------------------------------------------------------------------------------
 * 通过反射调用成员方法
 * 1：获取Class对象
 * 2：通过Class对象获取Constructor对象
 * 3：Constructor.newInstance()创建对象
 * 4：通过Class对象获取Method对象  ------getMethod("方法名");
 * 5: Method对象调用invoke方法实现功能
 * 如果调用的是私有方法那么需要暴力访问
 * 1: getDeclaredMethod()
 * 2: setAccessiable();
 */
public class ReflectIntroduction {
}
