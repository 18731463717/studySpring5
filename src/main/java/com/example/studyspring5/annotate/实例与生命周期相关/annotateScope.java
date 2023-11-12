package com.example.studyspring5.annotate.实例与生命周期相关;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/10 8:01
 */
//用于声明一个Spring Bean实例的作用域，作用域的范围有以下几种
//    singleton：单例模式，在spring中容器该实例唯一，Spirng默认的实例模式
//    prototype: 原型模式，每次使用实例都将重新创建。
//    request: 在同一请求中使用相同的实例，不同请求重新创建
//    session: 在同一会话中使用相同的实例，不同会话重新创建
public class annotateScope {

    @Bean
    @Scope("singleton")
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
