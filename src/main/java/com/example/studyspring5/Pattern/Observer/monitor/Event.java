package com.example.studyspring5.Pattern.Observer.monitor;

import java.lang.reflect.Method;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 19:01
 */
//监听器的一种包装，标准事件源的定义
public class Event {
    //事件源，事件由谁发起的，保存起来
    private Object source;
    //事件触发要通知谁
    private Object target;
    //事件触发，要做什么动作，回调
    private Method callback;
    //事件名称，出发的是什么事件
    private String trigger;
    //触发的时间
    private long time;

    public Event(Object target ,Method callback){
        this.target = target;
        this.callback = callback;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public Event setCallback(Method callback) {
        this.callback = callback;
        return this;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public Event setTime(long time) {
        this.time = time;
        return this;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
