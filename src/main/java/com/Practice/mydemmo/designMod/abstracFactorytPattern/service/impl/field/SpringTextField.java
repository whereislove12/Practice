package com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.field;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.TextField;

//Spring文本框类：具体产品
public class SpringTextField implements TextField {
    public void display() {
        System.out.println("显示绿色边框文本框。");
    }
}