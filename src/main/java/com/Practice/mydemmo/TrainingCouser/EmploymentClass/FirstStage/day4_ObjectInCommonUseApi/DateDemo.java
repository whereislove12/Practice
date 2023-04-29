package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateDemo {
    @Test
    public void test1() {
        Date date = new Date();
        date.setDate(2023);
        date.setMonth(3);
        date.setDate(8);
        System.out.println(date);
        System.out.println(date.getTime());
    }

    @Test
    public void test2() {
        Date date = new Date(1680964661155l);
        System.out.println(date);
    }

    @Test
    public void test3() {
        System.out.println(System.currentTimeMillis());
    }

    @Test
    public void test4() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String now = simpleDateFormat.format(new Date());
        System.out.println(now);
    }
}
