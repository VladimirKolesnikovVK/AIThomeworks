package de.ait.holidayKalender;

import java.util.Date;

public class Holiday {
    private String holidayName;
    private Date date;

    public Holiday(String holidayName, Date date) {
        this.holidayName = holidayName;
        this.date = date;
    }

    public String getHolidayName() {
        return holidayName;
    }

    public void setHolidayName(String holidayName) {
        this.holidayName = holidayName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
