package com.Practice.mydemmo.TrainingCouser.ElementaryClass.day9_MethodOverload;

/**
 * 方法重载:
 * 1.多个方法在同一个类中
 * 2.多个方法具有相同的方法名
 * 3.多个方法的参数不同，类型不同或者数量不同
 * 4.多个方法可以有不同的访问权限修饰符
 */
public class MethodReload {
    Integer age;
    String name;

    public MethodReload() {

    }

    protected MethodReload(Integer age) {
        this.age = age;
    }

    private MethodReload(String name) {
        this.name = name;
    }

    MethodReload(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public void demo1() {

    }

    public void demo1(int num) {

    }

    void demo1(int num, String name) {

    }

    public String demo1(String name) {
        return "";
    }
}
