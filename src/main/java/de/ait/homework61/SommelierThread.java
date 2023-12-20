package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SommelierThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(SommelierThread.class);

    private String wineName;

    public SommelierThread(String wineName) {
        this.wineName = wineName;
    }

    public String getWineName() {
        return wineName;
    }

    @Override
    public void run(){
        System.out.println("Выбираю вино");
        try {
            Thread.sleep(2000);
        }catch (InterruptedException exception){
            LOGGER.error("exception" + exception);
        }
        System.out.println("Вино выбрано: " + getWineName());
    }
}
