package com.dunka.chapter03.waitOld;

/**
 * @Author Dunka
 * @Description wait等待条件发生变化，容易造成程序逻辑混乱
 * @Date 23:05   2019/8/27
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = "";
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadSubtract subtract1 = new ThreadSubtract(subtract);
        ThreadSubtract subtract2 = new ThreadSubtract(subtract);
        subtract1.setName("subtract1");
        subtract1.start();
        subtract2.setName("subtract2");
        subtract2.start();
        Thread.sleep(5000);
        ThreadAdd threadAdd = new ThreadAdd(add);
        threadAdd.setName("add");
        threadAdd.start();
    }
}
