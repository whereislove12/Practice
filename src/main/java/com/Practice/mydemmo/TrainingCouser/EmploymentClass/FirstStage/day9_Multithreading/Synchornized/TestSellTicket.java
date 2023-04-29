package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day9_Multithreading.Synchornized;

import org.junit.jupiter.api.Test;

public class TestSellTicket {
    @Test
    public void test1(){
        SellTicket1 sellTicket1 = new SellTicket1();
        new Thread(sellTicket1,"窗口1").start();
        new Thread(sellTicket1,"窗口2").start();
        new Thread(sellTicket1,"窗口3").start();
    }

    @Test
    public void test2(){
        SellTicket2 sellTicket2 = new SellTicket2();
        new Thread(sellTicket2,"窗口1").start();
        new Thread(sellTicket2,"窗口2").start();
        new Thread(sellTicket2,"窗口3").start();
    }

    @Test
    public void test3(){
        SellTicket3 sellTicket3 = new SellTicket3();
        new Thread(sellTicket3,"窗口1").start();
        new Thread(sellTicket3,"窗口2").start();
        new Thread(sellTicket3,"窗口3").start();
    }
}
