package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.box;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.ComboBox;

//Summer组合框类：具体产品
public class SummerComboBox implements ComboBox {
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}