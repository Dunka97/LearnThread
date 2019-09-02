package com.dunka.chapter06.singleton_5;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:53   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    private static MyObject instance = null;

    static {
        instance = new MyObject();
    }
    private MyObject() {
    }

    public static MyObject getInstance(){
        return instance;
    }
}
