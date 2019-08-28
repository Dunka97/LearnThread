package com.dunka.chapter03.pipeReaderWriter;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedReader;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:03   2019/8/28
 * @ClassName ReadData
 */
public class ReadData {
    public void readMethod(PipedReader inputStream){
        try {
            System.out.println("read:");
            char[] bytes = new char[20];
            int length = inputStream.read(bytes);
            while (length!=-1){
                String data = new String(bytes,0,length);
                System.out.print(data);
                length = inputStream.read(bytes);
            }
            System.out.println();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
