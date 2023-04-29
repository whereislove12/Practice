package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day15_JunitReflectClassLoadoerAnnotation.Annotation.AnnotationDemo1;

/**
 * 书架
 */
@Book(name = "图书大全", authors = {})
public class BookShelf {
    @Book(name = "英语书", authors = {"张老师", "李老师"})
    public void getEnglishBook() {

    }

    @Book(name = "科学与技术",price = 25.9,authors = {"老张","老王"})
    public void getScienceAndTechnology(){

    }
}
