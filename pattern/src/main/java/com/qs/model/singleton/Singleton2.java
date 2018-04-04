package com.qs.model.singleton;

/**
 * 单例模式-线程不安全
 */
public class Singleton2 {
    private  static  Singleton2  singleton2=null;
    private Singleton2(){}
    public  static Singleton2   getSingleton2(){
        if(singleton2==null){
            return   new Singleton2();

        }
        return   singleton2;
    }
}
