package com.dunka.chapter07.threadRunSyn;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 20:08   2019/9/5
 * @ClassName MyThread
 */
public class MyThread extends Thread {
    volatile private static int addNumber = 1;
    private Object lock;
    private String showChar;
    private int showNumPosition;
    private int printCount = 0;//统计打印了几个字母

    public MyThread(Object lock, String showChar, int showNumPosition) {
        this.lock = lock;
        this.showChar = showChar;
        this.showNumPosition = showNumPosition;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                while (true){
                    if (addNumber%3==showNumPosition){
                        System.out.println("ThreadName = "+Thread.currentThread().getName()
                        +" runCount = "+addNumber+" "+showChar);
                        lock.notifyAll();
                        addNumber++;
                        printCount++;
                        if (printCount==3){
                            break;
                        }
                    }else{
                        lock.wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
