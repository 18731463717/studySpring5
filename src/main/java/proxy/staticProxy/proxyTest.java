package proxy.staticProxy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 8:20
 */
public class proxyTest {
    public static void main(String[] args) {
//        只能代理自己的儿子找对象，不能代理别人
        Father father = new Father(new Son());
        father.findLove();
    }
}
