package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeaMasterThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(TeaMasterThread.class);

    private String teeType;

    public TeaMasterThread(String teeType) {
        this.teeType = teeType;
    }

    public String getTeeType() {
        return teeType;
    }

    @Override
    public void run(){
        try {
        LOGGER.info( "Завариваю чай: " + getTeeType());
            Thread.sleep(4000);
            LOGGER.info("Чай готов");
        }catch (InterruptedException exception){
            LOGGER.error("exception: " + exception);
        }

    }
}
