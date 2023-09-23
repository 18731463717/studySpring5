package com.example.studyspring5.factory.method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/10 21:33

 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavvaCourseFactory();
        ICoure iCoure = factory.create();
        iCoure.record();

        factory = new PythonCourseFactory();
        iCoure = factory.create();
        iCoure.record();
    }
}