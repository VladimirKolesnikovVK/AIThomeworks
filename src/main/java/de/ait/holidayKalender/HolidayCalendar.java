package de.ait.holidayKalender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;

public class HolidayCalendar {
    private static final Logger LOGGER = LoggerFactory.getLogger(HolidayCalendar.class);

    private List<Holiday> holidays;

    public HolidayCalendar() {
        this.holidays = new ArrayList<>();
    }

    public synchronized void addHoliday(Holiday holiday) {
        holidays.add(holiday);
    }

    public synchronized void removeHoliday(Holiday holiday) {
        holidays.remove(holiday);
    }

    public synchronized void displayHolidays() {
        for (Holiday holiday : holidays) {
            LOGGER.info("holidayName:{}, holidayDate: {}", holiday.getHolidayName(),holiday.getDate());
        }
    }
}
