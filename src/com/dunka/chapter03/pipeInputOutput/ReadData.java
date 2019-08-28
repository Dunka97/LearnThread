package com.dunka.chapter03.pipeInputOutput;

import java.io.IOException;
import java.io.PipedInputStream;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:03   2019/8/28
 * @ClassName ReadData
 */
public class ReadData {
    public void readMethod(PipedInputStream inputStream){
        try {
            System.out.println("read:");
            byte[] bytes = new byte[20];
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
