package com.example.studyspring5.Pattern.factory.simple;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/8 7:53
 */
public class CourseFactory {
    public ICoure create(Class<? extends ICoure> clazz){
        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
