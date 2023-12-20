package de.ait.homework61;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeMakerThread extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(CoffeeMakerThread.class);

    @Override
    public void run(){
        System.out.println("Кофе мелется");
        try {
            Thread.sleep(2500);
        }catch (InterruptedException exception){
            LOGGER.error("exception: " + exception);
        }
        System.out.println("Кофе заваривается");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException exception){
            LOGGER.error("exception: " + exception);
        }
        System.out.println("Кофе готов");
    }
}
