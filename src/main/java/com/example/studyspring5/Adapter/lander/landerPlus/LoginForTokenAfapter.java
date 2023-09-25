package com.example.studyspring5.Adapter.lander.landerPlus;

import com.example.studyspring5.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:24
 */
public class LoginForTokenAfapter implements LoginAdpter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAfapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
