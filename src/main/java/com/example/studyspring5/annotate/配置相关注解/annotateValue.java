package com.example.studyspring5.annotate.配置相关注解;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/12 9:15
 */
//用于注入在配置文件中配置好的属性
public class annotateValue {

    @Value("${jwt.apple}")
    private String ac;
}
