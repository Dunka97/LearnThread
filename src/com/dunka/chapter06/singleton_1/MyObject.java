package com.dunka.chapter06.singleton_1;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 11:16   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){

    }
    public static MyObject getInstance(){
        if (myObject!=null){

        }else {
            myObject = new MyObject();
        }
        return myObject;
    }
}
