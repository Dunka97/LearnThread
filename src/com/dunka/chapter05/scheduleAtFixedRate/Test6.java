package com.dunka.chapter05.scheduleAtFixedRate;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author Dunka
 * @Description  测试scheduleAtFixedRate方法任务不延时--long类型
 * @Date 9:23   2019/9/2
 * @ClassName Test1
 * @Result 在不延时的情况下，如果执行任务的时间没有被延时，则第一次执行任务的时间是任务开始时间加上delay时间Test5
 * 下一次执行任务的开始时间是上一次任务的开始时间加上period时间
 */
public class Test6 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        Timer timer = new Timer();
        System.out.println("当前时间："+System.currentTimeMillis());
        timer.schedule(myTask,3000,4000);
    }

    static class MyTask extends TimerTask{
        @Override
        public void run() {
            try {
                System.out.println("begin timer = "+System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("end timer = "+System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
