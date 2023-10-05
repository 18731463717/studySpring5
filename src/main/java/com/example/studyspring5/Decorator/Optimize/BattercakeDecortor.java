package com.example.studyspring5.Decorator.Optimize;
//拓展煎饼套餐的抽象装饰类
public abstract class BattercakeDecortor extends Battercake{

    private Battercake battercake;

    public BattercakeDecortor(Battercake battercake){
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }
}
