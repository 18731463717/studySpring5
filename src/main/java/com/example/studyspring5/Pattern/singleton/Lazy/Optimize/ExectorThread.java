package com.example.studyspring5.Pattern.singleton.Lazy.Optimize;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 12:35
 */
public class ExectorThread implements Runnable{
    @Override
    public void run() {
        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() +":" + singleton);
    }
}
