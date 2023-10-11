package com.example.studyspring5.Pattern.Adapter.lander.landerPlus;

import com.example.studyspring5.Pattern.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:20
 */
//新浪登录
public class LoginForSinaAdapter implements LoginAdpter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
