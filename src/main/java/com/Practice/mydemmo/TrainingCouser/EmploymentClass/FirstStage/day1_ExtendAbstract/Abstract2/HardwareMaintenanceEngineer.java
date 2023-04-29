package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass.MaintainerEmployee;

/**
 * 硬件维护工程师
 */
public class HardwareMaintenanceEngineer extends MaintainerEmployee {
    @Override
    public void work() {
        System.out.println("员工号为" + this.id + "的 " + this.name + "员工，正在修复打印机");
    }
}
