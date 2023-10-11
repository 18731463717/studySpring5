package com.example.studyspring5.Pattern.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 7:32
 */
public class JavaVideo implements IVideo{
    //java产品族
    @Override
    public void record() {
        System.out.println("java录播视频");
    }
}
