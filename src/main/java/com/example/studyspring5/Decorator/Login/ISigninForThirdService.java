package com.example.studyspring5.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:30
 */
//新功能接口，继承老登录注册功能
public interface ISigninForThirdService extends ISigninService{
    //QQ登录
    ResultMsg loginForQQ(String id);
    //微信登陆
    ResultMsg loginForWechat(String id);
    //记住登陆状态后自动登录
    ResultMsg loginForToken(String token);
    //手机号登陆
    ResultMsg loginForTelPhone(String telphone,String code);
    //注册后自动登录
    ResultMsg loginForRegist(String username,String passport);
}
