package com.example.studyspring5.Strategy.CommodityExample.optimize;

import com.example.studyspring5.Strategy.CommodityExample.PromotionActivity;
import com.example.studyspring5.Strategy.CommodityExample.PromotionStrategy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:42
 */
public class test {
    public static void main(String[] args) {
        String key = "GROUPBUY";

        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(key));
        promotionActivity.execute();
    }
}
