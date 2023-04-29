package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class类主要API：
 * 成员变量  - Field
 * 成员方法  - Constructor
 * 构造方法  - Method
 * 获取class文件对象的方式：
 * 1：对象.getClass()  Object类的getClass()方法    多用于对象的获取字节码方式
 * 2：类名.class  数据类型的静态属性 class    多用于参数传递
 * 3：Class ForName(String className)  全类名   Class类中的静态方法,多用于配置文件,读取文件,加载类
 * 4.String getSimpleName();    获得简单类名，只是类名，没有包
 * 5.String getName();    获取完整类名，包含包名+类名
 * 6.public Constructor<T> getConstructor(Class<?>... parameterTypes)    根据对应参数获取相应构造方法
 * 7.Constructor[] getConstructors()    获取所有的public修饰的构造方法
 * 8.Method[] getMethods()     获取所有的public修饰的成员方法，包括父类中
 * 9.Method getMethod("方法名", 方法的参数类型... 类型)
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
@Data
@NoArgsConstructor
public class ReflectDemo1 {
    /**
     * 三种反射获取 class 类的方式
     *
     * @throws ClassNotFoundException
     */
    @Test
    public void testGetClass() throws ClassNotFoundException {
        Class<MyClass> myClassClass = MyClass.class;

        MyClass myClass = new MyClass();
        Class<? extends MyClass> aClass = myClass.getClass();

        Class<?> aClass1 = Class.forName("com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect.ReflectDemo1");

        //内部类不可以这么获取
        /*Class<?> aClass1 = Class.forName("com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage." +
                "day15_JunitReflectClassLoadoer.Reflect.ReflectDemo1.MyClass");*/
    }

    /**
     * public T newInstance()
     * 通过反射创建对象
     */
    @Test
    public void testCreateObject() throws InstantiationException, IllegalAccessException {
        Class<ReflectDemo1> reflectDemo1Class = ReflectDemo1.class;
        ReflectDemo1 reflectDemo1 = reflectDemo1Class.newInstance();
        System.out.println(reflectDemo1);
    }

    /**
     * 获取名称
     */
    @Test
    public void testGetName() {
        String simpleName = MyClass.class.getSimpleName();
        System.out.println(simpleName);

        String name = MyClass.class.getName();
        System.out.println(name);
    }

    /**
     * 获取构造方法
     * public Constructor<T> getConstructor(Class<?>... parameterTypes)
     * 根据对应参数获取相应构造方法
     */
    @Test
    public void testGetConstructor() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<ReflectDemo1> reflectDemo1Class = ReflectDemo1.class;
        Constructor<ReflectDemo1> constructor = reflectDemo1Class.getConstructor();
        ReflectDemo1 reflectDemo1 = constructor.newInstance();
    }

    /**
     * 获取方法
     */
    @Test
    public void testGetMethods() throws ClassNotFoundException {
        Class<?> aClass = Class.forName("com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Reflect.ReflectDemo1");
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            System.out.println();
        }
    }

    /**
     * 获取方法
     */
    @Test
    public void testGetMethod() throws NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<Object> myClassClass = Object.class;
        Object o = myClassClass.newInstance();
        Method getMyClass = myClassClass.getMethod("toString");
        System.out.println(getMyClass);
        Object invoke = getMyClass.invoke(o);
        System.out.println(invoke);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class MyClass {
        private String str;
        private Integer num;
    }
}
