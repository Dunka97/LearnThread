package com.dunka.chapter03.pipeInputOutput;

import java.io.PipedInputStream;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 13:07   2019/8/28
 * @ClassName ThreadRead
 */
public class ThreadRead extends Thread {
    private ReadData readData;
    private PipedInputStream inputStream;

    public ThreadRead(ReadData readData, PipedInputStream inputStream) {
        this.readData = readData;
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        readData.readMethod(inputStream);
    }
}
