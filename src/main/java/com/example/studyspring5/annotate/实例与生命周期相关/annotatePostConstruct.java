package com.example.studyspring5.annotate.实例与生命周期相关;

import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/10 8:11
 */
//用于修饰方法，当对象实例被创建并且依赖注入完成后执行，
//可用于对象实例化的初始化操作
public class annotatePostConstruct {

    @PostConstruct
    public void restTemplate(){

    }
}
