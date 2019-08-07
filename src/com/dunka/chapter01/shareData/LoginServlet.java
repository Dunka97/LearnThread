package com.dunka.chapter01.shareData;

/**
 * @Author Dunka
 * @Description 没加synchronized就是非线程安全
 * @Date 11:23   2019/8/7
 * @ClassName LoginServlet
 */
public class LoginServlet {
    private static String usernameRef;
    private static String passwordRef;
    synchronized public static void doPost(String username,String password){

        try {
            usernameRef = username;
            if (username.equals("a")){
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("username="+usernameRef+"   password="+password);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
