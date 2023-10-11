package com.example.studyspring5.Pattern.Observer.monitor;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 19:17
 */
//监听器，观察者的桥梁
public class EventLisenter {
    //JDK底层的Lisenter也是这么设计的
    protected Map<String,Event> events = new HashMap<>();
    
    //通过事件名称和一个目标对象来触发事件
    public void addLisenter(String evenType, Object target){
        try{
            this.addLisenter(
                    evenType,
                    target,
                    target.getClass().getMethod("on" + toUpperFirstCase(evenType),Event.class));
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void addLisenter(String evenType, Object target, Method method) {
        //注册事件
        events.put(evenType,new Event(target,method));
    }



    //触发，只要有动作就触发
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());

        try{
            //发起回调
            if(event.getCallback() != null){
                //利用反射调用它的回调函数
                event.getCallback().invoke(event.getTarget(),event);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger){
        if(!this.events.containsKey(trigger)){return;}
        trigger(this.events.get(trigger).setTrigger(trigger));
    }
    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
