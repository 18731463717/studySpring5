package com.example.studyspring5.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:36
 */
public class DecoratorTest {
    public static void main(String[] args) {
        ISigninForThirdService signinForThirdService = new ISigninForThirdServiceImpl(new ISigninServiceImpl());
        //实现动态登录
        signinForThirdService.loginForQQ("QQ登录");
    }
}
