package com.ifeng.schedule.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Inku on 2015/3/13.
 */
public class BlockingQueueTest {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);
        bq.put("java");
        bq.put("java");
        bq.put("java");

    }
}
