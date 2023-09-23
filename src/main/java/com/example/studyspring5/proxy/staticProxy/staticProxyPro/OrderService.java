package com.example.studyspring5.proxy.staticProxy.staticProxyPro;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 12:32
 */
public class OrderService implements IOrderService{
    private OrderDao orderDao;

    public OrderService(){
        //用构造方法模拟Spring自动注入
        orderDao = new OrderDao();
    }

    @Override
    public int creatOrder(Order order) {
        System.out.println("OrderService调用orderDao创建订单");
        return orderDao.insert(order);
    }
}
