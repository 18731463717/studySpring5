package com.example.studyspring5.Decorator.Optimize;
//鸡蛋装饰者类
public class EggDecortor extends BattercakeDecortor{
    public EggDecortor(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething(){}

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }
}
