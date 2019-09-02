package com.dunka.chapter06.singleton_2_2;

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
        try {
            synchronized (MyObject.class){
                if (myObject!=null){

                }else {
                    Thread.sleep(3000);
                    myObject = new MyObject();
                }
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return myObject;
    }
}
