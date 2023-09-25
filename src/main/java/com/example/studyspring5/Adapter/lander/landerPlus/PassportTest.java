package com.example.studyspring5.Adapter.lander.landerPlus;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 22:04
 */
public class PassportTest {
    public static void main(String[] args) {
        IPassportForThird passportForThird = new PassportForThirdAdapter();
        passportForThird.loginForQQ("111");
    }
}
