package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic2;

import org.junit.jupiter.api.Test;

/**
 * 泛型
 */
public class TestPolymorphic {
    @Test
    public void test1(){
        Computer computer = new Computer();
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        computer.open();
        computer.useMouse(mouse);
        computer.useMouse(keyboard);
        computer.useKeyboard(keyboard);
        computer.useKeyboard(mouse);
        computer.close();
    }
}
