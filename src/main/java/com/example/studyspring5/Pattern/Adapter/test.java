package com.example.studyspring5.Pattern.Adapter;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 8:35
 */
public class test {
    public static void main(String[] args) {
        DC5 dc5 = new PowerAdpter(new AC220());
        dc5.outputDC5();
    }
}
