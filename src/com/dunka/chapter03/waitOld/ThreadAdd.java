package com.dunka.chapter03.waitOld;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:03   2019/8/27
 * @ClassName ThreadAdd
 */
public class ThreadAdd extends Thread {
    private Add p;

    public ThreadAdd(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
