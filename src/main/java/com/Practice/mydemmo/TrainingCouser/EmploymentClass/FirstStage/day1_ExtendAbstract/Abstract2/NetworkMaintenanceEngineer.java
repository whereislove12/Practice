package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass.MaintainerEmployee;

/**
 * 网络维护工程师
 */
public class NetworkMaintenanceEngineer extends MaintainerEmployee {
    @Override
    public void work() {
        System.out.println("员工号为" + this.id + "的 " + this.name + "员工，正在检查网络是否畅通");
    }
}
