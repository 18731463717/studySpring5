package com.example.studyspring5.Pattern.Strategy.CommodityExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:18
 */
//拼团策略类
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，拼满20人成团，全团享受团购价");
    }
}
