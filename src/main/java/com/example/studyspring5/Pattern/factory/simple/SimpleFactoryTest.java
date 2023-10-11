package com.example.studyspring5.Pattern.factory.simple;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/8 7:58
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICoure iCoure = factory.create(JavaCourse.class);
        iCoure.record();
    }
}
