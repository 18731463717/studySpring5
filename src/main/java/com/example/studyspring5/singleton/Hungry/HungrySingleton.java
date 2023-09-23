package com.example.studyspring5.singleton.Hungry;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 11:59
 */
//饿汉式单例模式
public class HungrySingleton {
    //先静态，后动态
    //先属性，后方法
    //线上后下
    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
