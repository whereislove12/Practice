package com.Practice.mydemmo.TrainingCouser.EmploymentClass.FirstStage.day2_InterfacePolymorphic.Polymorphic2;

import java.util.Objects;

public class Computer {
    public void open() {
        System.out.println("开机");
    }

    public void close() {
        System.out.println("关机");
    }

    public void useMouse(USB usb) {
        if (Objects.isNull(usb)) {
            System.out.println("请插入设备后运行");
        }
        if (!(usb instanceof Mouse)) {
            System.out.println("请插入正确的设备");
            return;
        }
        System.out.println("使用鼠标");
    }

    public void useKeyboard(USB usb) {
        if (Objects.isNull(usb)) {
            System.out.println("请插入设备后运行");
        }
        if (!(usb instanceof Keyboard)) {
            System.out.println("请插入正确的设备");
            return;
        }
        System.out.println("使用键盘");
    }
}
