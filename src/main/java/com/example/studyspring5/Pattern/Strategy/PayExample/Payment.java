package com.example.studyspring5.Pattern.Strategy.PayExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:52
 */
//支付抽象类，定义支付规范和支付逻辑
public abstract class Payment {
    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public PayState pay(String uid,double amount){
        if(queryBalance(uid) < amount){
            return new PayState(500,"支付失败","余额不足");
        }
        return new PayState(200,"支付成功","支付金额" + amount);
    }
}
