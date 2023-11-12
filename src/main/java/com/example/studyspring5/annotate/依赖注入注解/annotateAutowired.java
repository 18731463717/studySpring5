package com.example.studyspring5.annotate.依赖注入注解;

import com.example.studyspring5.annotate.组件相关.annotateService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/9 12:29
 */
//会根据对象的类型自动注入依赖对象，默认要求注入对象实例必须存在，可以配置
//required=false
public class annotateAutowired {

    @Autowired
    private annotateService service;
}
