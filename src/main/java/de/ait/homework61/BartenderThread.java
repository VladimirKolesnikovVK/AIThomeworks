package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread.class);

    @Override
    public void run(){
        System.out.println("Готовлю напиток");
        try {
            Thread.sleep(3000);
        }catch (InterruptedException exception){
            LOGGER.info("exception: " + exception);
        }
        System.out.println("Напиток готов");
    }
}
