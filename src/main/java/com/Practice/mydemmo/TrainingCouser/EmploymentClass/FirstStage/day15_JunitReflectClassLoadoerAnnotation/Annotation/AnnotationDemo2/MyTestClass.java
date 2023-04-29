package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation.AnnotationDemo2;

public class MyTestClass {
    @MyAfter
    public void after() {
        System.out.println("after");
    }

    @MyTest
    public void test() {
        System.out.println("test");
    }

    @MyBefore
    public void before() {
        System.out.println("before");
    }
}
