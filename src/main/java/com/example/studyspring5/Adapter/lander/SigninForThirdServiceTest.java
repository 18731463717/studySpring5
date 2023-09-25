package com.example.studyspring5.Adapter.lander;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:10
 */
public class SigninForThirdServiceTest {
    public static void main(String[] args) {
        SigninForThirdService signinForThirdService = new SigninForThirdService();
        //不改变原来的代码，也能够兼容新的需求，还可以再加一层策略模式
        signinForThirdService.loginForQQ("111111111111111111111");
    }
}
