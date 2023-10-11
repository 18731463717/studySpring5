package com.example.studyspring5.Pattern.Decorator.Login;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/8 8:34
 */
public class ISigninForThirdServiceImpl implements ISigninForThirdService{

    private ISigninService signinService;

    public ISigninForThirdServiceImpl(ISigninService iSigninService){
        this.signinService = iSigninService;
    }

    @Override
    public ResultMsg regist(String username, String password) {
        return signinService.regist(username, password);
    }

    @Override
    public ResultMsg login(String username, String passwoed) {
        return signinService.login(username, passwoed);
    }

    @Override
    public ResultMsg loginForQQ(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return null;
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return null;
    }

    @Override
    public ResultMsg loginForTelPhone(String telphone, String code) {
        return null;
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        return null;
    }


}
