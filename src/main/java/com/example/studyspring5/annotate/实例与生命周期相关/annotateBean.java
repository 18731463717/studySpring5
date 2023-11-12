package com.example.studyspring5.annotate.实例与生命周期相关;

import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/10 7:59
 */
//用于修饰方法，标识该方法会创建一个Bean实例，并交给Spring容器来管理
public class annotateBean {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
