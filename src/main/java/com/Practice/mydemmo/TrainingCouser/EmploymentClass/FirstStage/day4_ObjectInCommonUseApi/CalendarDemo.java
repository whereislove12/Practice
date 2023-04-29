package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day4_ObjectInCommonUseApi;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONDAY);
        int day = calendar.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + day + "日");
    }

    @Test
    public void test2() {
        Calendar calendar = Calendar.getInstance();
        Date time = calendar.getTime();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");
        String timeStr = dateFormat.format(time);
        System.out.println(timeStr);
    }

    /**
     * 获取任意一年的二月有多少天
     */
    @Test
    public void test3() {
        Calendar calendar = Calendar.getInstance();
        //设置月份为3月1日
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        //三月一日减去一天就是二月的最后一天
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        int date = calendar.get(Calendar.DATE);
        System.out.println(date);
    }
}
