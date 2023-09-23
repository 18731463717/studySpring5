package com.example.studyspring5.proxy.dynamic.CGLibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/22 19:35
 */
public class CglibMeipo implements MethodInterceptor {

    public Object getInstance(Class<?> calzz)throws Exception{
        Enhancer enhancer = new Enhancer();
        //要把那个设置为即将生成的新父类
        enhancer.setSuperclass(calzz);
        enhancer.setCallback(this);

        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        before();
        Object obj = methodProxy.invokeSuper(o,objects);
        after();
        return obj;
    }

    public void before(){
        System.out.println("我是媒婆：我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }

    public void after(){
        System.out.println("如果合适的的话，就准备办事");
    }
}
