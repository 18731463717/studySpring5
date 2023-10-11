package com.example.studyspring5.Pattern.proxy.staticProxy.staticProxyPro;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 12:30
 */
public class OrderDao {
    public int insert(Order order){
        System.out.println("OrderDao创建Order成功：模拟数据落库");
        return 1;
    }
}
