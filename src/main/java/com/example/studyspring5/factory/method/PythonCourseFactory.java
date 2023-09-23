package com.example.studyspring5.factory.method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/10 21:29
 */
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICoure create() {
        return new PythonCourse();
    }
}
