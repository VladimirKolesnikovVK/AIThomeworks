package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BartenderThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(BartenderThread.class);

    @Override
    public void run(){
        try {
        LOGGER.info("Готовлю напиток");
            Thread.sleep(3000);
            LOGGER.info("Напиток готов");
        }catch (InterruptedException exception){
            LOGGER.error("error! - ошибка" + exception);
        }
    }
}
