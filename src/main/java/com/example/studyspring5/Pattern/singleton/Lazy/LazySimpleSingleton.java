package com.example.studyspring5.Pattern.singleton.Lazy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 12:32
 */
//懒汉式单例模式
public class LazySimpleSingleton {
    private LazySimpleSingleton(){}
    //静态块，公共内存区域
    private static LazySimpleSingleton lazy = null;
    public static LazySimpleSingleton getInstance(){
        if (lazy == null){
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }

}
