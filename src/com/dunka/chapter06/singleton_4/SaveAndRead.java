package com.dunka.chapter06.singleton_4;

import javax.swing.*;
import java.io.*;

/**
 * @Author Dunka
 * @Description //序列化与反序列化的单例模式实现--在反序列化中使用readResolve()方法
 * @Date 15:43   2019/9/2
 * @ClassName SaveAndRead
 */
public class SaveAndRead {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyObject myObject = MyObject.getInstance();
        FileOutputStream fileOutputStream = new FileOutputStream(new File("myObjectFile.txt"));
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        outputStream.writeObject(myObject);
        outputStream.close();
        fileOutputStream.close();
        System.out.println(myObject.hashCode());

        FileInputStream fileInputStream = new FileInputStream(new File("myObjectFile.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MyObject myObject1 = (MyObject) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        System.out.println(myObject1.hashCode());
    }
}
