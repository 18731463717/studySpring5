package com.example.studyspring5.Template;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/24 17:21
 */
public class NetworkCourseTest {
    public static void main(String[] args) {
        System.out.println("--Java架构师课程--");
        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        System.out.println("--大数据课程--");
        BigDataCourse dataCourse = new BigDataCourse(true);
        dataCourse.createCourse();
    }
}
