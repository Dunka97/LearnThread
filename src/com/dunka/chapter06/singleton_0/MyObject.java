package com.dunka.chapter06.singleton_0;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:16   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    private static MyObject myObject = new MyObject();
    private MyObject(){

    }
    public static MyObject getInstance(){
        return myObject;
    }
}
