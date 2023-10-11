package com.example.studyspring5.Pattern.Decorator.Optimize;

//香肠装饰者类
public class SausageDecorator extends BattercakeDecortor{
    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    protected void doSomething(){}

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }
}
