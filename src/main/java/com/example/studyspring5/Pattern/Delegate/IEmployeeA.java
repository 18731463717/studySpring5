package com.example.studyspring5.Pattern.Delegate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 11:23
 */
//员工类A
public class IEmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我的工作是："+ command);
    }
}
