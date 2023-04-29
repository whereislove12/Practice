package com.Practice.mydemmo.designMod.abstracFactorytPattern.service;

//界面皮肤工厂接口：抽象工厂
public interface SkinFactory {
    public Button createButton();

    public TextField createTextField();

    public ComboBox createComboBox();
}