package com.dunka.chapter03.waitReleaseLock;

/**
 * @Author Dunka
 * @Description 当方法wait()执行后，锁会被自动释放，如果wait改成sleep，就是同步的效果
 * @Date 15:30   2019/8/26
 * @ClassName Test
 */
public class Test {
    public static void main(String[] args) {
        Object lock = new Object();
        ThreadA threadA = new ThreadA(lock);
        ThreadB threadB = new ThreadB(lock);
        threadA.start();
        threadB.start();
    }
}
