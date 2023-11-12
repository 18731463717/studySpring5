package com.example.studyspring5.annotate.依赖注入注解;

import com.example.studyspring5.annotate.组件相关.annotateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/9 12:35
 */
//当一个对象有多个实例可以注入时，使用Autowired注解无法进行注入
//这时可以使用Qualifier注解指定实力的名称进行精准注入
public class annotateQualifier {
//    这样注入的bean名字就相同
    @Autowired
    @Qualifier("annotateService")
    private annotateService service;

    @Autowired
    @Qualifier("annotateService")
    private annotateResource resource;

}
