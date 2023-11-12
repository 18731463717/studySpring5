package com.example.studyspring5.annotate.配置相关注解;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/12 9:23
 */
//用于当满足某个条件时，该组件或Bean将被Spring容器创建，
//下面是几个常用注解
//    @ConditionalOnBean          当某个bean存在时，配置生效
//    @ConditionalOnMissingBean   当某个bean不存在时，配置生效
//    @ConditionalOnClass         当某个Classpath存在时，配置生效
//    @ConditionalOnMissingClass  当某个Classpath不存在时，配置生效
@Configuration
public class annotateConditional {
    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper objectMapper(Jackson2ObjectMapperBuilder builder){
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        return objectMapper;
    }

}
