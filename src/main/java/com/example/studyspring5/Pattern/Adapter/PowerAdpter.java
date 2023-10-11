package com.example.studyspring5.Pattern.Adapter;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/25 8:31
 */
//适配器类
public class PowerAdpter implements DC5{
    private AC220 ac220;
    public PowerAdpter(AC220 ac220){
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5() {
        int adapterInput = ac220.outPutAC220V();

        //变压器过程
        int adapterOutput = adapterInput/44;
        System.out.println("使用变压器输入："+ adapterInput +"输出："+adapterOutput);
        return adapterOutput;
    }
}
