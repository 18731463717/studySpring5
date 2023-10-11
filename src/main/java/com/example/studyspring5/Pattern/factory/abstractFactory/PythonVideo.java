package com.example.studyspring5.Pattern.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 8:05
 */
public class PythonVideo implements IVideo{
    @Override
    public void record() {
        System.out.println("python录播视频");
    }
}
