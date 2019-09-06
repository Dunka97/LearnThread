package com.dunka.chapter07.groupInnerStop;

/**
 * @Author Dunka
 * @Description 组内线程批量停止
 * @Date 17:16   2019/9/4
 * @ClassName Run
 */
public class Run {
    public static void main(String[] args) {
        try {
            ThreadGroup group = new ThreadGroup("我的线程组");
            for (int i = 0; i <5 ; i++) {
                MyThread thread = new MyThread(group,"线程"+(i+1));
                thread.start();
            }
            Thread.sleep(5000);
            group.interrupt();
            System.out.println("调用了interrupt方法");
        } catch (InterruptedException e) {
            System.out.println("停了停了");
            e.printStackTrace();
        }
    }
}
