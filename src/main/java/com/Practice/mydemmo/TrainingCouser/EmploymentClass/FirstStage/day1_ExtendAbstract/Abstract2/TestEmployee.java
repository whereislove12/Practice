package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass.DeveloperEmployee;
import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass.MaintainerEmployee;
import org.junit.jupiter.api.Test;

public class TestEmployee {
    @Test
    public void test1() {
        DeveloperEmployee engineer = new JavaEEEngineer();
        engineer.setName("小强");
        engineer.setId(28);
        engineer.work();
    }

    @Test
    public void test2() {
        DeveloperEmployee engineer = new AndroidEngineer();
        engineer.setName("小周");
        engineer.setId(25);
        engineer.work();
    }

    @Test
    public void test3() {
        MaintainerEmployee engineer = new NetworkMaintenanceEngineer();
        engineer.setName("小黄");
        engineer.setId(32);
        engineer.work();
    }

    @Test
    public void test4() {
        MaintainerEmployee engineer = new HardwareMaintenanceEngineer();
        engineer.setName("老王");
        engineer.setId(35);
        engineer.work();
    }

}
