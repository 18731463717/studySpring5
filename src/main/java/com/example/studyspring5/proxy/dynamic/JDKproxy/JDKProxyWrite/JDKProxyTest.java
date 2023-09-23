package com.example.studyspring5.proxy.dynamic.JDKproxy.JDKProxyWrite;

import com.example.studyspring5.proxy.dynamic.JDKproxy.Customer;
import com.example.studyspring5.proxy.dynamic.JDKproxy.JDKMeipo;
import com.example.studyspring5.proxy.staticProxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/21 19:50
 */
public class JDKProxyTest {
    public static void main(String[] args) {
        try {
            Person obj = (Person) new JDKMeipo().getInstance(new Customer());
            obj.findLove();
            //通过反编译工具查看源代码
            byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0",new Class[]{Person.class});
            FileOutputStream os = new FileOutputStream("E://$Proxy0.class");
            os.write(bytes);
            os.close();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }
}
