package com.example.studyspring5.Pattern.Decorator.Optimize;

//基本煎饼类（或者说说是基本套餐）
public class BaseBattercake extends Battercake{
    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
