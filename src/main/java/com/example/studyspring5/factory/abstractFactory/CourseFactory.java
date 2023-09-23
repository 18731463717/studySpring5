package com.example.studyspring5.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 7:30
 * 抽象工厂是用户的主入口
 * 是spring中应用最广泛的一种设计模式
 * 易于扩展
 */
public interface CourseFactory {
    //抽象工厂类
    INote createNote();
    IVideo createVideo();
}
