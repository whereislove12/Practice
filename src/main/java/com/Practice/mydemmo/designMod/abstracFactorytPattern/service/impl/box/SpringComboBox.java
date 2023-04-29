package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.box;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.ComboBox;

//Spring组合框类：具体产品
public class SpringComboBox implements ComboBox {
    public void display() {
        System.out.println("显示绿色边框组合框。");
    }
}

