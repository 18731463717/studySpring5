package com.example.studyspring5.Strategy.CommodityExample;


import org.springframework.util.StringUtils;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 17:24
 */
public class test {
    public static void main(String[] args) {
        //缺点是如果促销越来越多，就需要频繁改变if下的分支,频繁的改变难免会出错
        PromotionActivity promotionActivity = null;
        String promotionKey = "COUPON";
        if(StringUtils.pathEquals(promotionKey,"COUPON")){
            promotionActivity = new PromotionActivity(new CouponStrategy());
        }else if(StringUtils.pathEquals(promotionKey,"EMPTY")){
            promotionActivity = new PromotionActivity(new EmptyStrategy());
        }
        promotionActivity.execute();
    }
}
