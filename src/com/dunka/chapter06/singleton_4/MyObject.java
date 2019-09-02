package com.dunka.chapter06.singleton_4;

import java.io.Serializable;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:40   2019/9/2
 * @ClassName MyObject
 */
public class MyObject implements Serializable {
    private static final long serialVersionUID = 888L;
    private MyObject() {
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    protected Object readResolve(){
        System.out.println("调用了ReadResolve方法");
        return MyObjectHandler.myObject;
    }

    private static class MyObjectHandler{
        private static final MyObject myObject = new MyObject();
    }
}
