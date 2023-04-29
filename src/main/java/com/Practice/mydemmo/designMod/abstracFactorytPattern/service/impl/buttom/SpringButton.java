package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.buttom;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.Button;

//Spring按钮类：具体产品
public class SpringButton implements Button {
    public void display() {
        System.out.println("显示浅绿色按钮。");
    }
}