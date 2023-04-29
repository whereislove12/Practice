package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.field;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.TextField;

//Summer文本框类：具体产品
public class SummerTextField implements TextField {
    public void display() {
        System.out.println("显示蓝色边框文本框。");
    }
}