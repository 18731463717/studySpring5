package com.example.studyspring5.proxy.dynamic.JDKproxy.DBProxy;

import com.example.studyspring5.proxy.staticProxy.staticProxyPro.IOrderService;
import com.example.studyspring5.proxy.staticProxy.staticProxyPro.Order;
import com.example.studyspring5.proxy.staticProxy.staticProxyPro.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/18 19:30
 */
public class Test {
    public static void main(String[] args) {
        try{
            Order order = new Order();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2022/10/11");
            order.setCreateTime(date.getTime());

            IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().
                    getInstance(new OrderService());

            orderService.creatOrder(order);

        }catch (Exception e){

        }
    }
}
