package com.example.studyspring5.proxy.staticProxy.staticProxyPro;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 12:46
 */
public class OrderServiceStaticProxy implements IOrderService{
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
    private IOrderService orderService;
    public OrderServiceStaticProxy(IOrderService orderService){
        this.orderService = orderService;
    }
    @Override
    public int creatOrder(Order order) {
        before();
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(simpleDateFormat.format(new Date(time)));
        System.out.println("静态代理类自动分配到【DB_" + dbRouter + "】数据源处理数据");
        DynamicDataSourceEntry.set(dbRouter);
        orderService.creatOrder(order);
        after();
        return 0;
    }

    private void after() {
        System.out.println(" 在这之后 ");
    }

    private void before() {
        System.out.println(" 在这之前 ");
    }
    public static void main(String[] args) {
        try{
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2022/01/02");
            order.setCreateTime(date.getTime());

            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.creatOrder(order);
        }catch (Exception e ){
            e.printStackTrace();
        }
    }
}
