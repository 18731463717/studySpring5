package com.example.studyspring5.Observer;

import java.util.Observable;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 8:24
 */
//消息通知--被观察者
public class GPer extends Observable {

    private String name = "GPer生态圈";
    private static GPer gper = null;
    private GPer(){}

    public static GPer getInstance(){
        if(null == gper){
            gper = new GPer();
        }
        return gper;
    }

    public String getName(){
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
