package com.vaani.blocking.arrayqueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ExecutorQueue
{
        public static BlockingQueue     queue   = new ArrayBlockingQueue(100);

        /**
         * Method to add Data in to the Queue
         */
        public static void addDataInQueue(Object obj)
        {
                queue.add(obj);
        }

        /**
         * Get the Data from the Queue
         */
        public static Object getDataFromQueue() throws InterruptedException
        {
                return queue.take();
        }
}
