package com.example.studyspring5.annotate.实例与生命周期相关;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/10 8:10
 */
//当同一个对象有多个实例时，优先选择该实例
public class annotatePrimary {

    @Bean
    @Primary
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
