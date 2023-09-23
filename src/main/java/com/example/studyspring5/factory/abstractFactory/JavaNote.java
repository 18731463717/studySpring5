package com.example.studyspring5.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 7:34
 */
public class JavaNote implements INote{
    //java产品族
    @Override
    public void edit() {
        System.out.println("java课堂笔记");
    }
}
