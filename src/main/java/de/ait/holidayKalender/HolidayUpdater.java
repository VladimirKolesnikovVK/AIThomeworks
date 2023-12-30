package de.ait.holidayKalender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolidayUpdater extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(HolidayUpdater.class);

    private HolidayCalendar holidayCalendar;

    public HolidayUpdater(HolidayCalendar holidayCalendar) {
        this.holidayCalendar = holidayCalendar;
    }

    @Override
    public void run(){

    }
}
