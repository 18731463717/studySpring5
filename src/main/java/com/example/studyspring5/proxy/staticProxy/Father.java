package com.example.studyspring5.proxy.staticProxy;

/**
 * @author ZhangCM
 * @version 1.0
 * @description: TODO
 * @date 2023/9/13 8:17
 */
public class Father {
    private Son son;
    //由父亲代理儿子去物色相亲对象
    public Father(Son son){
        this.son = son;
    }
    //获取目标对象的引用
    public void findLove(){
        System.out.println("父亲帮忙物色对象");
        this.son.findLove();
        System.out.println("双方同意交往");
    }
}
