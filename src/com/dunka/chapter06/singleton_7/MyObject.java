package com.dunka.chapter06.singleton_7;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 16:39   2019/9/2
 * @ClassName MyObject
 */
public class MyObject {
    public static String getConnection(){
        return MyEnumSingleton.connectionFactory.getConnection();
    }
    public enum MyEnumSingleton {
        connectionFactory;
        private String connection;
        private MyEnumSingleton(){
            connection = new String("Dunka");
        }
        public String getConnection(){
            return  connection;
        }
    }
}
