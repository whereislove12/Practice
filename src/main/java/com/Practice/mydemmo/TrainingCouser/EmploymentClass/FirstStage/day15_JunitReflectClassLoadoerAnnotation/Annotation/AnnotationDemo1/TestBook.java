package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation.AnnotationDemo1;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBook {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        /**
         * 获取类上的注解
         */
        Class<BookShelf> bookShelfClass = BookShelf.class;
        Book shelfClassAnnotation = bookShelfClass.getAnnotation(Book.class);
        System.out.print(shelfClassAnnotation.name());
        System.out.print(shelfClassAnnotation.price());
        System.out.println(Arrays.toString(shelfClassAnnotation.authors()));

        /**
         * 获取方法上的注解
         */
        Method getEnglishBook = bookShelfClass.getMethod("getEnglishBook");
        Book englishBookAnnotation = getEnglishBook.getAnnotation(Book.class);
        System.out.print(englishBookAnnotation.name());
        System.out.print(englishBookAnnotation.price());
        System.out.println(Arrays.toString(englishBookAnnotation.authors()));

        /**
         * 获取方法上的注解
         */
        Class<?> aClass = Class.forName("com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation.AnnotationDemo1.BookShelf");
        Method scienceAndTechnology = aClass.getMethod("getScienceAndTechnology");
        Book scienceAndTechnologyAnnotation = scienceAndTechnology.getAnnotation(Book.class);
        System.out.print(scienceAndTechnologyAnnotation.name());
        System.out.print(scienceAndTechnologyAnnotation.price());
        System.out.println(Arrays.toString(scienceAndTechnologyAnnotation.authors()));
    }
}
