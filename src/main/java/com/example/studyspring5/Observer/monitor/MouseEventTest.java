package com.example.studyspring5.Observer.monitor;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 19:54
 */
public class MouseEventTest {
    public static void main(String[] args) {
        try{
            MouseEventCallback callback = new MouseEventCallback();

            //注册事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK,callback);
            mouse.addLisenter(MouseEventType.ON_MOVE,callback);
            mouse.addLisenter(MouseEventType.ON_WHEEL,callback);
            mouse.addLisenter(MouseEventType.ON_OVER,callback);

            mouse.click();

            mouse.blur();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
