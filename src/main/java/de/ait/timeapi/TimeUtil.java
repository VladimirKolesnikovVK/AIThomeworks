package de.ait.timeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeUtil {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear() + " " + localDate.getMonth() + " " + localDate.getDayOfMonth());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour() + ":" + localDateTime.getMinute());
    }
}
