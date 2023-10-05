package com.example.studyspring5.Decorator.Optimize;

public class BattercakeTest {
    public static void main(String[] args) {
        Battercake battercake;
        //买个煎饼
        battercake = new BaseBattercake();
        //加个蛋
        battercake = new EggDecortor(battercake);
        //再加个蛋
        battercake = new EggDecortor(battercake);
        //价格肠
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake.getMsg() +"---:----" + battercake.getPrice());
    }
}
