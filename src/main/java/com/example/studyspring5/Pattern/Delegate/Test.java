package com.example.studyspring5.Pattern.Delegate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 11:29
 */
public class Test {
    public static void main(String[] args) {
        new Boss().command("登录",new Leader());
    }
}
