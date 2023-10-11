package com.example.studyspring5.Pattern.factory.method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/8 7:51
 */
public class JavaCourse implements ICoure {

    static String a  = "123456";

    static {
        System.out.println(a);
    }

    @Override
    public void record() {
        System.out.println("录制JAVA视频");
        c();
    }
    public void c(){
        System.out.println(a);
    }
}
