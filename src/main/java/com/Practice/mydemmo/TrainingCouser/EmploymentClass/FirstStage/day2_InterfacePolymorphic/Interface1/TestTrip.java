package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface1;

import com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface1.Interface.Trip;
import org.junit.jupiter.api.Test;

public class TestTrip {
    @Test
    public void test1() {
        Trip climbMountain = new ClimbMountain();
        climbMountain.goTrip();
        climbMountain.getVehicle();
        System.out.println("一共走了" + Trip.distance + "米");
    }

    @Test
    public void test2(){
        Trip parkTourism = new ParkTourism();
        parkTourism.goTrip();
        parkTourism.getVehicle();
    }
}
