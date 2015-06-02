package com.vaani.user;

import com.vaani.blocking.arrayqueue.ExecutorQueue;

public class ConsumerThread extends Thread
{
        public void run()
        {
                System.out.println("\nConsumerThread started...");
                boolean loop = true;
                while (loop)
                {
                        try
                        {
                                System.out.println("\nConsumerThread: Waiting to fetch data from Queue...");
                                String data = (String) ExecutorQueue.getDataFromQueue();
                                System.out.println("ConsumerThread: Got the data from Queue; Object = " + data);
                                System.out.println("ConsumerThread: Processing the data (" + data +")");
                                                               
                                /*
                                 * Data Processing section:
                                 *
                                 * Note: Write your processing logic here based on the data retrieved
                                 */
                        }
                        catch (InterruptedException e)
                        {
                                e.printStackTrace();
                        }
                }
        }
}