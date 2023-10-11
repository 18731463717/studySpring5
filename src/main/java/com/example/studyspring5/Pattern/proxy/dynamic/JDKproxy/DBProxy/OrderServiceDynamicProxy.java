package com.example.studyspring5.Pattern.proxy.dynamic.JDKproxy.DBProxy;

import com.example.studyspring5.Pattern.proxy.staticProxy.staticProxyPro.DynamicDataSourceEntry;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/18 19:20
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    private Object target;

    public Object getInstance(Object target){
        this.target = target;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args);
        Object object = method.invoke(target,args);
        after();
        return object;
    }


    private void before(Object target){
        try{
            System.out.println("Proxy before method");
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(yearFormat.format(new Date(time)));
            System.out.println("静态代理类自动分别配到【DB" + dbRouter + "】数据源处理数据");
            DynamicDataSourceEntry.set(dbRouter);
        }catch (Exception e){

        }
    }

    private void after(){
        System.out.println("Proxy before after");
    }
}
