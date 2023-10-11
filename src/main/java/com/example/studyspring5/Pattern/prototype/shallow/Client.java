package com.example.studyspring5.Pattern.prototype.shallow;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 7:11
 */
public class Client {
    private Prototype prototype;
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public Prototype startClone(Prototype concretePrototype){
        return (Prototype) concretePrototype.clone();
    }
}
