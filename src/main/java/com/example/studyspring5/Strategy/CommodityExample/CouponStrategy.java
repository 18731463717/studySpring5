package com.example.studyspring5.Strategy.CommodityExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 12:09
 */
//优惠卷抵扣策略类
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠卷，课程价格直接减优惠卷面值抵扣");
    }
}
