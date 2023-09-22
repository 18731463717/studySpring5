package prototype.shallow;

import com.sun.javaws.IconUtil;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:13
 */
public class PrototypeTest {
    public static void main(String[] args) {
        //创建一个具体需要克隆的对象
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        //填充属性方便测试
        concretePrototype.setAge(18);
        concretePrototype.setName("萝卜");
        List hobbies = new ArrayList<String>();
        concretePrototype.setHobbies(hobbies);
        System.out.println(concretePrototype);

        //创建Client对象，准备开始克隆
        Client client = new Client(concretePrototype);
        ConcretePrototypeA concretePrototypeClone = (ConcretePrototypeA) client.startClone(concretePrototype);
        System.out.println(concretePrototypeClone);

        System.out.println("原型对象引用地址值:" + concretePrototype.getName());
        System.out.println("克隆对象引用地址值:" + concretePrototypeClone.getName());
        System.out.println("两个对象地址是否一样：" + (concretePrototype.getName()==concretePrototypeClone.getName()));
    }
}
