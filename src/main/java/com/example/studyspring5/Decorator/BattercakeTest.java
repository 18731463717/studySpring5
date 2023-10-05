package com.example.studyspring5.Decorator;

public class BattercakeTest {

    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getMsg() + "总价格：" + battercake.getPrice());

        BattercakeWithEgg battercake1 = new BattercakeWithEgg();
        System.out.println(battercake1.getMsg() + ":" + battercake1.getPrice());

        BattercakeWithEggAndSausage battercake2 = new BattercakeWithEggAndSausage();
        System.out.println(battercake2.getMsg() + ":" + battercake2.getPrice());
    }
}
