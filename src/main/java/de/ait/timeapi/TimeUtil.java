package de.ait.timeapi;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeUtil {
    public static void main(String[] args) {
        LocalDate localDateGermany = LocalDate.now();
        System.out.println("localDateGermany-->" + localDateGermany);

        /*System.out.println(localDate.getYear() + " " + localDate.getMonth() + " " + localDate.getDayOfMonth());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getHour() + ":" + localDateTime.getMinute());

        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalDate localDateAustralia = LocalDate.now(zoneId);
        LocalDate localDateAfrica = LocalDate.now(ZoneId.of("Afrika/Addis_Ababa"));
        System.out.println("localDateAustralia--> " + localDateAustralia);
        System.out.println("localDateAfrika--> " + localDateAfrica);*/

        LocalDate localDateOf2000 = LocalDate.of(2000, Month.APRIL,5);
        System.out.println(localDateOf2000);

        LocalDate localDate = LocalDate.ofYearDay(2000,1);
        System.out.println(localDate);

        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth().name().toLowerCase());


        localDate = localDate.plusDays(46);
        localDate = localDate.minusDays(17);
        System.out.println(localDate);

        String pattern = "dd-MM-yyyy";
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(pattern);
        System.out.println(dateTimeFormatter.format(localDate));
        DateTimeFormatter dateTimeFormatterISO = DateTimeFormatter.ISO_DATE;
        System.out.println(localDate.format(dateTimeFormatterISO));

        String dateToParse = "10.10.2020";
        LocalDate localDateParsed = LocalDate.parse(dateToParse, dateTimeFormatter);
        System.out.println(localDateParsed.getYear());
        System.out.println(localDateParsed.minusDays(800));

    }
}
