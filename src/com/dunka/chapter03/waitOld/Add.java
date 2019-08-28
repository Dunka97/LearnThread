package com.dunka.chapter03.waitOld;



/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:08   2019/8/26
 * @ClassName Add
 */
public class Add {
    private String lock;

    public Add(String lock) {
        super();
        this.lock = lock;
    }
    public void add(){
        synchronized (lock){
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
