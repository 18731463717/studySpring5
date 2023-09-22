package proxy.dynamic.JDKproxy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/16 12:46
 */

import proxy.staticProxy.Person;
//客户类：被代理对象
public class Customer implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180");
        System.out.println("8块腹肌");
    }
}
