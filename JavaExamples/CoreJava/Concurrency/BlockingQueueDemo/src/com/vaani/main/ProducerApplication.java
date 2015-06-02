package com.vaani.main;

import com.vaani.blocking.arrayqueue.ExecutorQueue;
import com.vaani.user.ConsumerThread;

public class ProducerApplication
{
        public static void main(String[] args)
        {

                // Start the Processor thread so that it will wait for an Object in the Blocking Queue. As soon as an Object is
                // added in the Queue, it will take and process the data
                System.out.println("ProducerApplication: Starting the Processor Thread...\n");
                ConsumerThread thread = new ConsumerThread();
                thread.start();

                ExecutorQueue.addDataInQueue("Object-1");
                ExecutorQueue.addDataInQueue("Object-2");
        }
}