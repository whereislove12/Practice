package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day1_ExtendAbstract.Abstract2.abstractClass.DeveloperEmployee;

/**
 * Android研发工程师
 */
public class AndroidEngineer extends DeveloperEmployee {
    @Override
    public void work() {
        System.out.println("员工号为" + this.id + "的 " + this.name + "员工，正在研发淘宝手机客户端软件");
    }
}
