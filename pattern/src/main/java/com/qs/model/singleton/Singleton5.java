package com.qs.model.singleton;

public class Singleton5 {
    private static  class   SingletonHolder{
        private  static  final Singleton5 singleton5 =new  Singleton5();
    }

    private   Singleton5(){

    }
    public  static  Singleton5  getSingleton5(){
        return    SingletonHolder.singleton5;
    }
}
/**
 *防止反射漏洞在构造函数里抛出异常
 *private  Singletong(){
 *     if(null!=instance){
 *          throw  new  RuntimeExcepton();
 *     }
 *}
 * 防止反序列化漏洞
 *
 *
 *
 */