package com.example.studyspring5.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 8:30
 */
//教师类--观察者
public class Teacher implements Observer {
    private String name;
    public Teacher(String name){
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("============================");
        System.out.println(name + "老师你好！\n" +
                "您收到了一个来自”" + gPer.getName() +"“ 的提问，希望您解答，问题如下：\n" +
                question.getContent() +"\n提问者：" + question.getUserName());
    }
}
