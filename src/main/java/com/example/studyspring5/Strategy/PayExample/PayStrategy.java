package com.example.studyspring5.Strategy.PayExample;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/23 18:05
 */
//支付策略管理类
public class PayStrategy {
    public static final String ALI_PAY = "ALI_PAY";
    public static final String JD_PAY = "JD_PAY";
    public static final String UNION_PAY = "UNION_PAY";
    public static final String WECHAT_PAY = "WECHAT_PAY";
    public static final String DEFAULT_PAY = "DEFAULT_PAY";

    private static Map<String,Payment> payStrategy = new HashMap<>();
    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
    }

    public static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }
}
