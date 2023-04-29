package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day10_LockConditionCallableFutureTimer.Lock;

import org.junit.jupiter.api.Test;

public class TestSellTicket {
    @Test
    public void test1(){
        SellTicket4 sellTicket4 = new SellTicket4();
        new Thread(sellTicket4,"窗口1").start();
        new Thread(sellTicket4,"窗口2").start();
        new Thread(sellTicket4,"窗口3").start();
    }
}
