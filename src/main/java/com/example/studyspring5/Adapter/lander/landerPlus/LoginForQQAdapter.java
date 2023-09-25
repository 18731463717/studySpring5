package com.example.studyspring5.Adapter.lander.landerPlus;

import com.example.studyspring5.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:18
 */
//qq登录
public class LoginForQQAdapter implements LoginAdpter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        System.out.println(id + ".");
        return null;
    }
}
