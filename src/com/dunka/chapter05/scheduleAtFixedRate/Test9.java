package com.dunka.chapter05.scheduleAtFixedRate;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author Dunka
 * @Description 验证schedule方法不具有追赶执行性
 * @Date 10:00   2019/9/2
 * @ClassName Test9
 */
public class Test9 {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        System.out.println("现在执行时间："+new Date());
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.SECOND,calendar.get(Calendar.SECOND)-20);
        Date date = calendar.getTime();
        System.out.println("计划执行时间"+date);
        Timer timer = new Timer();
        timer.schedule(myTask,date,2000);
    }

    static class MyTask extends TimerTask{
        @Override
        public void run() {
            System.out.println("begin time"+System.currentTimeMillis());
            System.out.println("end Time "+System.currentTimeMillis());
        }
    }
}
