package com.java;

import java.util.concurrent.*;

import static com.java.ChocolateFactory.getInstance;

/**
 * 测试方法
 *
 * @author Administrator
 */
public class TestMain extends Thread {


    @Override
    public void run() {
        ChocolateFactory instance = getInstance();
        instance.fill();
        instance.boil();
        instance.drain();
    }

    public static void main(String[] args) {

        TestMain[] mts = new TestMain[10];
        for(int i = 0 ; i < mts.length ; i++){
            mts[i] = new TestMain();
        }

        for (int j = 0; j < mts.length; j++) {
            mts[j].start();
        }
    }

}
