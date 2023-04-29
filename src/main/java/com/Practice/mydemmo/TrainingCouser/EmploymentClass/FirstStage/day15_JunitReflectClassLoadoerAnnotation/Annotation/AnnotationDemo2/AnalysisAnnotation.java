package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation.AnnotationDemo2;

import io.micronaut.core.util.CollectionUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;

/**
 * 解析自定义注解
 */
public class AnalysisAnnotation {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<MyTestClass> myTestClassClass = MyTestClass.class;
        MyTestClass myTestClass = myTestClassClass.newInstance();

        Method[] methods = myTestClassClass.getMethods();

        ArrayList<Method> methodArrayList1 = new ArrayList<>();
        ArrayList<Method> methodArrayList2 = new ArrayList<>();
        ArrayList<Method> methodArrayList3 = new ArrayList<>();

        for (Method method : methods) {
            if (method.isAnnotationPresent(MyBefore.class)) {
                methodArrayList1.add(method);
            }
            if (method.isAnnotationPresent(MyTest.class)) {
                methodArrayList2.add(method);
            }
            if (method.isAnnotationPresent(MyAfter.class)) {
                methodArrayList3.add(method);
            }
        }

        if (CollectionUtils.isNotEmpty(methodArrayList1)){
            for (Method method : methodArrayList1) {
                method.invoke(myTestClass);
            }
        }
        if (CollectionUtils.isNotEmpty(methodArrayList2)){
            for (Method method : methodArrayList2) {
                method.invoke(myTestClass);
            }
        }
        if (CollectionUtils.isNotEmpty(methodArrayList3)){
            for (Method method : methodArrayList3) {
                method.invoke(myTestClass);
            }
        }
    }
}
