package com.example.studyspring5.singleton.Lazy.Optimize;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 12:32
 */
//懒汉式单例模式
//解决了饿汉式单例的内存浪费和懒汉式加入synchronized的性能问题
public class  LazyInnerClassSingleton {
    private LazyInnerClassSingleton(){}
//    final 保证了这个方法不会被重写重载
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.LAZY;
    }

//    内部类 默认不加载
    //内部类只会在第一次使用的时候加载
    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}
