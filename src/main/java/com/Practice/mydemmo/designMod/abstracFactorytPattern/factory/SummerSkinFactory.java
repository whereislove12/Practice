package com.Practice.mydemmo.designMod.abstracFactorytPattern.factory;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.Button;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.ComboBox;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.SkinFactory;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.TextField;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.box.SummerComboBox;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.buttom.SummerButton;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.field.SummerTextField;

//Summer皮肤工厂：具体工厂
class SummerSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SummerButton();
    }

    public TextField createTextField() {
        return new SummerTextField();
    }

    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}