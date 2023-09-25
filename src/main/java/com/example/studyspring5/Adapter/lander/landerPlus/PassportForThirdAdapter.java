package com.example.studyspring5.Adapter.lander.landerPlus;

import com.example.studyspring5.Adapter.lander.ResultMsg;
import com.example.studyspring5.Adapter.lander.SiginService;

import javax.security.auth.login.AppConfigurationEntry;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:33
 */
public class PassportForThirdAdapter extends SiginService implements IPassportForThird {
    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAfapter.class);
    }

    @Override
    public ResultMsg loginForTelphone(String phone, String code) {
        return processLogin(phone,LoginForTleAdapter.class);
    }

    @Override
    public ResultMsg loginForRegist(String username, String passport) {
        super.regist(username,null);
        return super.login(username,null);
    }

    //这里用到了简单工厂及策略模式
    private ResultMsg processLogin(String key,Class<? extends LoginAdpter> clazz){
        try{
            LoginAdpter loginAdpter = clazz.newInstance();
            if(loginAdpter.support(loginAdpter)){
                return loginAdpter.login(key,loginAdpter);
            }else {
                return null;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
