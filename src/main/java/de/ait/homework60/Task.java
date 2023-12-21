package de.ait.homework60;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Task implements Runnable{
    private static final Logger LOGGER = LoggerFactory.getLogger(Task.class);
    private String message;

    public Task(String message){
        this.message = message;
    }
    @Override
    public void run() {
        LOGGER.info("message {}",message);
    }
}
