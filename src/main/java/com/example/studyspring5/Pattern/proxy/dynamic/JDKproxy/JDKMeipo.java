package com.example.studyspring5.Pattern.proxy.dynamic.JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/16 12:28
 */
//婚姻介绍所（媒婆）类：代理类
public class JDKMeipo implements InvocationHandler {
    private Object target;
    public Object getInstance(Object target) throws Exception{
        this.target = target;
//        Proxy.newProxyInstance作用见txt
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
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
