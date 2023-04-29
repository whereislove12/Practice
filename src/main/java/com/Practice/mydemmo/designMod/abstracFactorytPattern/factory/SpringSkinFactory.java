package com.Practice.mydemmo.designMod.abstracFactorytPattern.factory;

import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.Button;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.ComboBox;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.SkinFactory;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.TextField;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.box.SpringComboBox;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.buttom.SpringButton;
import com.Practice.mydemmo.designMod.abstracFactorytPattern.service.impl.field.SpringTextField;

//Spring皮肤工厂：具体工厂
class SpringSkinFactory implements SkinFactory {
    public Button createButton() {
        return new SpringButton();
    }

    public TextField createTextField() {
        return new SpringTextField();
    }

    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}