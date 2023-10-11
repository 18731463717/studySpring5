package com.example.studyspring5.Pattern.Delegate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 11:28
 */
//老板类
public class Boss {
    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
