package com.example.studyspring5.Pattern.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:25
 */
//登录注册老功能接口
public interface ISigninService {
    //注册
    ResultMsg regist(String username,String password);
    //登录
    ResultMsg login(String username,String passwoed);
}
