package com.example.studyspring5.Pattern.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:28
 */
public class ISigninServiceImpl implements ISigninService{
    @Override
    public ResultMsg regist(String username, String password) {
        return new ResultMsg(200,"注册成功",new Member());
    }

    @Override
    public ResultMsg login(String username, String passwoed) {
        return null;
    }
}
