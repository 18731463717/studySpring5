package com.example.studyspring5.Pattern.Adapter.lander.landerPlus;

import com.example.studyspring5.Pattern.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:27
 */
public class LoginForWechatAdapter implements LoginAdpter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
