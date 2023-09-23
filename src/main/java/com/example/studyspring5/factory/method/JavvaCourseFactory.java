package com.example.studyspring5.factory.method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/10 21:28
 */
public class JavvaCourseFactory implements ICourseFactory{
    @Override
    public ICoure create() {
        return new JavaCourse();
    }
}
