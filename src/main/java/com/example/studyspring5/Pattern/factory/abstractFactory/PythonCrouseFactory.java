package com.example.studyspring5.Pattern.factory.abstractFactory;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/11 8:05
 */
public class PythonCrouseFactory implements CourseFactory{
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
