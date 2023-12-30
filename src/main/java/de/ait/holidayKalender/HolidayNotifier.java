package de.ait.holidayKalender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HolidayNotifier extends Thread{
    private static final Logger LOGGER = LoggerFactory.getLogger(HolidayNotifier.class);

    private HolidayCalendar holidayCalendar;

    public HolidayNotifier(HolidayCalendar holidayCalendar) {
        this.holidayCalendar = holidayCalendar;
    }
    @Override
    public void run(){

    }
}
