package com.example.studyspring5.Pattern.Strategy.CommodityExample;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:21
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        promotionStrategy.doPromotion();
    }
}
