package com.example.studyspring5.Strategy.PayExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:58
 */
//支付状态包装类
public class PayState {
    private int code;
    private Object data;
    private String msg;

    public PayState(int code,String msg,Object data){
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public String toString(){
        return ("支付状态：[" + code + "]，" + msg + "，交易详情：" + data);
    }

}
