package com.dunka.chapter03.waitOld;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:04   2019/8/27
 * @ClassName ThreadSubtract
 */
public class ThreadSubtract extends Thread{
    private Subtract subtract;

    public ThreadSubtract(Subtract subtract) {
        super();
        this.subtract = subtract;
    }

    @Override
    public void run() {
        subtract.subtract();
    }
}
