package com.qs.model.singleton;

public class Singleton4 {
    private  volatile static Singleton4  singleton4=null;
    private  Singleton4(){}
    public static  Singleton4  getSingleton4(){
        if(singleton4==null){
            synchronized(Singleton4.class){
                if(singleton4==null){
                    return  new Singleton4();
                }
                return  singleton4;
            }


        }
        return  singleton4;
    }
}
