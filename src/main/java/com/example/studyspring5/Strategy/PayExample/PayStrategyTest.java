package com.example.studyspring5.Strategy.PayExample;

import javax.annotation.Resource;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 18:34
 */
public class PayStrategyTest {
    public static void main(String[] args) {
        //手动初始化订单
        Order order = new Order("1","1234567890",324.15);

        //支付的时候确认用那个渠道
        System.out.println(order.pay(PayStrategy.JD_PAY));
    }
}
