package prototype.shallow;

import java.util.List;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:07
 */
public class ConcretePrototypeA implements Prototype{
    private int age;
    private String name;
    private List hobbies;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List getHobbies() {
        return hobbies;
    }
    public void setHobbies(List hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public ConcretePrototypeA clone() {
        ConcretePrototypeA concretePrototype = new ConcretePrototypeA();
        concretePrototype.setAge(this.age);
        concretePrototype.setName(this.name);
        concretePrototype.setHobbies(this.hobbies);
        return concretePrototype;
    }
}