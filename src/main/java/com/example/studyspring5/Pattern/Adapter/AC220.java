package com.example.studyspring5.Pattern.Adapter;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 8:28
 * 例子说明：我国民用电为220V交流电，但是电池用的是5V电，需要电源适配器改版电压才可以给手机正常充电
 */
//220V电压类
public class AC220 {
    public int outPutAC220V(){
        int output = 220;
        System.out.println("电压为"+ output +"V");
        return output;
    }

}
