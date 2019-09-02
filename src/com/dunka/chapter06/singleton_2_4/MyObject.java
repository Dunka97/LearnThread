package com.dunka.chapter06.singleton_2_4;

/**
 * @Author Dunka
 * @Description DCL双检查锁机制
 * @Date 11:16   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    private volatile static MyObject myObject;
    private MyObject(){

    }
     public static MyObject getInstance(){
        try {
            if (myObject!=null){

                }else {
                    Thread.sleep(3000);
                synchronized (MyObject.class){
                    if (myObject==null){
                        myObject = new MyObject();
                    }
                }
            }
        } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return myObject;
    }
}
