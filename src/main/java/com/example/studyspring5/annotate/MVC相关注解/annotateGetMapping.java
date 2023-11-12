package com.example.studyspring5.annotate.MVC相关注解;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/11/10 8:37
 */
//表示GET请求方法，等价于@GetMapping(Method = RequestMethod.Get)
public class annotateGetMapping {
    @GetMapping
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
    @PostMapping
//    与GetMapping同理
    public RestTemplate restTemplatePost(){
        return new RestTemplate();
    }
}
