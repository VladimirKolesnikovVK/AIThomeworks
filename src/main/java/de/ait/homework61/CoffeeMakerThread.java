package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMakerThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeMakerThread.class);

    @Override
    public void run(){
        try {
        LOGGER.info("Кофе мелется");
            Thread.sleep(2500);
            LOGGER.info("Кофе заваривается");
            Thread.sleep(5000);
            LOGGER.info("Кофе готов");
        }catch (InterruptedException exception){
            LOGGER.error("exception: " + exception);
        }
    }
}
