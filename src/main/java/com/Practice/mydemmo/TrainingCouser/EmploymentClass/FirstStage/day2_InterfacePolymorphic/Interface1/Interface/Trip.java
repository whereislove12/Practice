package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Interface1.Interface;

public interface Trip {
    /**
     * 距离
     * 接口只有常量,省略掉了 public static final
     */
    public static final int distance = 5000;

    public void goTrip();

    /**
     * 接口中可以有默认方法
     */
    default void getVehicle() {
        System.out.println("走着去");
    }
}
