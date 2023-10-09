package com.example.studyspring5.Observer.monitor;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/10/9 19:49
 */
public class MouseEventCallback {
    public void onClick(Event e){
        System.out.println("==============触发单击事件=============" + "\n" + e);
    }

    public void onDoubleClick(Event e){
        System.out.println("==============触发双击事件=============" + "\n" + e);
    }
    public void onUp(Event e){
        System.out.println("==============触发弹起事件=============" + "\n" + e);
    }
    public void onDown(Event e){
        System.out.println("==============触发按下事件=============" + "\n" + e);
    }
    public void onMove(Event e){
        System.out.println("==============触发移动事件=============" + "\n" + e);
    }
    public void onWheel(Event e){
        System.out.println("==============触发滚动事件=============" + "\n" + e);
    }
    public void onOver(Event e){
        System.out.println("==============触发悬停事件=============" + "\n" + e);
    }
    public void onblur(Event e){
        System.out.println("==============触发失焦事件=============" + "\n" + e);
    }
    public void onfocus(Event e){
        System.out.println("==============触发获焦事件=============" + "\n" + e);
    }
}
