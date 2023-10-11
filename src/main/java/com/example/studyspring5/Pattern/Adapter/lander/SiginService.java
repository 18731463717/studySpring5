package com.example.studyspring5.Pattern.Adapter.lander;



/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 18:53
 */
//假设老系统的登录代码
//为了遵信开闭原则 不懂老系统代码
public class SiginService {

    //注册方法
    public ResultMsg regist(String username , String password){
        return new ResultMsg(200,"注册成功",new Member());
    }

    //登录方法
    public ResultMsg login(String username,String password){
        return null;
    }
}
