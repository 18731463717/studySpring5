package com.example.studyspring5.proxy.dynamic.CGLibProxy;

import org.springframework.cglib.core.DebuggingClassWriter;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/22 19:45
 */
public class CglibTest {
    public static void main(String[] args) {
        try{
            System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"E://cglib_proxy_class/");

            Customer obj = (Customer) new CglibMeipo().getInstance(Customer.class);
            obj.findLove();
        }catch (Exception e){

        }
    }
}
