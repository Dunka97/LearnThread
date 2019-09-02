package com.dunka.chapter06.singleton_3;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 15:36   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    private MyObject(){
    }

    public static MyObject getInstance(){
        return MyObjectHandler.myObject;
    }

    private static class MyObjectHandler{
        private static MyObject myObject = new MyObject();
    }
}
