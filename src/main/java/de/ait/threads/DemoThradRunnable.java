package de.ait.threads;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoThradRunnable implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoThradRunnable.class);

    private Thread thread;

    private String threadName;

    public DemoThradRunnable(String threadName){
        this.threadName = threadName;
        LOGGER.info("creating" + threadName);
    }

    @Override
    public void run() {
        LOGGER.info("running" + threadName);
        for (int i=4; i>0; i--){
            LOGGER.info("thread: name:{}, i:{}",threadName,i);
            try {
                Thread.sleep(100);
                thread.interrupt();
                LOGGER.info("threadName:{}, State:{}" , threadName, thread.getState().name());
            } catch (Exception exception){
                LOGGER.error("thread {} was dead {} " ,threadName,exception);
            }
        }
        LOGGER.info("thread {} was dead", threadName);
        LOGGER.info("threadName:{}, State:{}" , threadName, thread.getState().name());
    }

    public void start(){
        LOGGER.info("Start {}", threadName);{
            if (thread == null){
                thread = new Thread(this, threadName);
                thread.start();
            }
        }
    }
}
