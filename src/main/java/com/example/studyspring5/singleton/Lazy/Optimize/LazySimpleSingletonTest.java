package com.example.studyspring5.singleton.Lazy.Optimize;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/12 12:36
 */
public class LazySimpleSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}
