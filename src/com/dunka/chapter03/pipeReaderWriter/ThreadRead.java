package com.dunka.chapter03.pipeReaderWriter;

import java.io.PipedReader;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:07   2019/8/28
 * @ClassName ThreadRead
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedReader inputStream;

    public ThreadRead(ReadData readData, PipedReader inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
