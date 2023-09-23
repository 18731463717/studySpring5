package com.example.studyspring5.Strategy.PayExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 18:25
 */
//创建订单类
public class Order {
    private String uid;
    private String ordId;
    private double amount;

    public Order(String uid,String ordId,double amount){
        this.uid = uid;
        this.ordId = ordId;
        this.amount = amount;
    }

    public PayState pay(){
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public PayState pay(String key){
        Payment payment = PayStrategy.get(key);
        System.out.println("欢迎使用" + payment.getName());
        System.out.println("本次交易金额为：" + amount + ", 开始扣款....");
        return payment.pay(uid,amount);
    }
}
