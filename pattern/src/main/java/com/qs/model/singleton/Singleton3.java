package com.qs.model.singleton;

public class Singleton3 {
    private  static  Singleton3  singleton3=null;
    private Singleton3(){}
    public  static synchronized  Singleton3   getSingleton3(){
        if(singleton3==null){
            return   new Singleton3();

        }
        return   singleton3;
    }
}
