package com.qs.model.singleton;

/**
 * 单例模式 -线程安全
 */
public class Singleton1 {
    private  static   final   Singleton1  singleton=new Singleton1();
    private Singleton1(){

    }
    public   Singleton1  getSingleton(){
        return  singleton;
    }
}
