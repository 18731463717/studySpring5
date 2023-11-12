package com.example.studyspring5.annotate.依赖注入注解;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/9 12:32
 */
//会根据对象的名称自动注入依赖对象，如果想要根据类型进行注入
//可以设置属性为type=****.class
public class annotateResource {
    @Autowired
    @Resource(name ="umsAdminServiceImpl")
    private annotateAutowired adminService;
}
