package com.example.studyspring5.Pattern.Strategy.CommodityExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:18
 */
public class CashbackStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回的金额转到支付宝账号");
    }
}
