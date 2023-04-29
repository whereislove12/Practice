package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface1;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface1.Interface.Trip;

/**
 * 公园玩耍
 */
public class ParkTourism implements Trip {
    @Override
    public void goTrip() {
        System.out.println("去公园喽");
    }

    @Override
    public void getVehicle() {
        System.out.println("坐大巴去");
    }
}
