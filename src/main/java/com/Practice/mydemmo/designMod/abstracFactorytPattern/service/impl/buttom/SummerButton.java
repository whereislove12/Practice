package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.buttom;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.Button;

//Summer按钮类：具体产品
public class SummerButton implements Button {
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}