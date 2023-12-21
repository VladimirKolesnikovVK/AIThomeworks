package de.ait.homework60;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTask implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(MyTask.class);
    @Override
    public void run() {
        for (int i =1; i <=5; i++){
            LOGGER.info("попытка:{}",i);
            try {
                Thread.sleep(500);
            }catch (InterruptedException exception){
                System.out.println("exception" + exception);
                LOGGER.error("exception {}", exception);
            }
        }
    }
}
