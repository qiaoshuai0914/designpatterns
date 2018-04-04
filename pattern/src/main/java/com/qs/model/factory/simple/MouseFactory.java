package com.qs.model.factory.simple;

public class MouseFactory {

    public   static   Mouse   getMouse(String  str){
        if("hp".equals(str)){
            return   new HpMouse();
        }
        if ("dell".equals(str)){
             return new DellMouse();
        }
        throw  new  RuntimeException();

    }
}
