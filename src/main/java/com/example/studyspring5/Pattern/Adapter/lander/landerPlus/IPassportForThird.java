package com.example.studyspring5.Pattern.Adapter.lander.landerPlus;

import com.example.studyspring5.Pattern.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:28
 */
public interface IPassportForThird {

    //QQ登录
    ResultMsg loginForQQ(String id);

    //微信登录
    ResultMsg loginForWechat(String id);

    //记录登录状态后自动登录--Token登录
    ResultMsg loginForToken(String token);

    //手机号登录
    ResultMsg loginForTelphone(String phone,String code);

    //注册后自动登录
    ResultMsg loginForRegist(String username,String passport);
}
