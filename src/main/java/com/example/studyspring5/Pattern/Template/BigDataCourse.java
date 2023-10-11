package com.example.studyspring5.Pattern.Template;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 17:18
 */
public class BigDataCourse extends NetworkCourse{
    private boolean needHomeworkFlag = false;

    public BigDataCourse(boolean needHomeworkFlag){
        this.needHomeworkFlag = needHomeworkFlag;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查大数据课程作业");
    }

    @Override
    protected boolean needHomework() {
        return this.needHomeworkFlag;
    }
}
