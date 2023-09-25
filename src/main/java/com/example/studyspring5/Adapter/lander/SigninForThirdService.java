package com.example.studyspring5.Adapter.lander;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 18:59
 */
//新的类继承原先的代码
public class SigninForThirdService extends SiginService {

    public ResultMsg loginForQQ(String openId){
        //1.openIn是全局唯一的，我们可以把它当最一个用户名（加长版的）
        //2.密码默认为QQ_EMPTY
        //3.注册（在原系统里创建一个用户）
        //4.调用原来的登录方法

        return loginForRegist(openId,null);
    }


    public ResultMsg loginForWechat(String openId){
        return null;
    }

    public ResultMsg loginForToken(String token){
        //通过Token获取用户信息，人后重新登陆一次
        return null;
    }

    public ResultMsg loginForTelphone(String telphone,String code){
        return null;
    }

    public ResultMsg loginForRegist(String username,String password){
        super.regist(username,null);
        return super.login(username,null);
    }

}
