package com.example.studyspring5.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 8:07
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        JavaCourseFactory factory = new JavaCourseFactory();
        factory.createNote().edit();
        factory.createVideo().record();
    }
}
