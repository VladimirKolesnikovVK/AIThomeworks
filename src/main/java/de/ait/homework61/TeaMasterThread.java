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
        System.out.println( "Завариваю чай: " + getTeeType());
        try {
            Thread.sleep(4000);
        }catch (InterruptedException exception){
            LOGGER.error("exception: " + exception);
        }
        System.out.println("Чай готов");
    }
}
