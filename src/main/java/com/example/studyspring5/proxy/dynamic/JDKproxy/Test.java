package com.example.studyspring5.proxy.dynamic.JDKproxy;

import com.example.studyspring5.proxy.staticProxy.Person;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/16 12:48
 */
public class Test {
    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Customer());
            person.findLove();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
