package de.ait.timeapi;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeUtil {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalDateTime localDateTimeAustralia = LocalDateTime.now(zoneId);
        System.out.println(localDateTimeAustralia);

        LocalDateTime localDateTime1FromUnits = LocalDateTime.of(2000,1,1,00,00,45);
        //localDateTime1FromUnits = localDateTime1FromUnits.plusHours(3);
        //System.out.println(localDateTime1FromUnits.atZone(zoneId));
        System.out.println(localDateTime1FromUnits);
        System.out.println("isEqual--> " + LocalDateTime.now().isEqual(localDateTime1FromUnits));
        System.out.println("isAfter--> " + LocalDateTime.now().isAfter(localDateTime1FromUnits));
        System.out.println("isBefore--> " + LocalDateTime.now().isBefore(localDateTime1FromUnits));

        System.out.println(localDateTime1FromUnits.getMinute());
        System.out.println(localDateTime1FromUnits.getMonth());
        System.out.println(localDateTime1FromUnits.plusHours(1));
        System.out.println(localDateTime1FromUnits.getDayOfWeek() + " " + localDateTime1FromUnits.getDayOfMonth());


    }
}
