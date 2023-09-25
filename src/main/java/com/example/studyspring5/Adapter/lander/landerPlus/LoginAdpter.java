package com.example.studyspring5.Adapter.lander.landerPlus;

import com.example.studyspring5.Adapter.lander.ResultMsg;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 19:17
 */
//登录适配接口
public interface LoginAdpter {
    boolean support(Object adapter);
    ResultMsg login(String id,Object adapter);
}
