package enums;

import java.util.EnumMap;
import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        DayUtil today = new DayUtil(29,Day.WENNESDAY, Seasons.WINTER );
        DayUtil tommorrow = new DayUtil(30,Day.WENNESDAY, Seasons.WINTER);

        System.out.println(today);
        System.out.println(today);
        System.out.println();
        System.out.println();

        System.out.println(today.dayOfWeek.equals(Day.FRIDAY));

        switch (today.dayOfWeek){
            case MONDAY -> System.out.println("net");
            case WENNESDAY -> System.out.println("da");
            default -> System.out.println("ne znau");
        }

        EnumMap<Day, String> dayStringEnumMap = new EnumMap<>(Day.class);
        //ключ
        dayStringEnumMap.put(Day.SATURDAY, "vihodnie");
        dayStringEnumMap.put(Day.THURSDAY, "uzhe ne ponedelnik");
        dayStringEnumMap.put(Day.MONDAY, "ne hochu na rabotu");
        dayStringEnumMap.put(Day.FRIDAY, "ura pjatniza");
        dayStringEnumMap.put(Day.FRIDAY, "ura eshe pjatniza :-)");


        System.out.println("size dayStringEnumMap" + dayStringEnumMap.size());
        System.out.println(dayStringEnumMap.get(Day.FRIDAY));
        System.out.println(dayStringEnumMap.get("Seassons:" + Seasons.AUTUMN));

        //System.out.println(dayStringEnumMap.remove(Day.MONDAY));
        //System.out.println(dayStringEnumMap.get(Day.MONDAY));

        System.out.println(dayStringEnumMap.containsKey(Day.MONDAY));
        System.out.println(dayStringEnumMap.containsValue("ne hochu na rabotu"));
        System.out.println("values:" + dayStringEnumMap.values());
        System.out.println(dayStringEnumMap.get(Day.FRIDAY).equals(dayStringEnumMap.get(Day.MONDAY)));

        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> weekend2 = EnumSet.of(Day.SATURDAY, Day.SUNDAY, Day.MONDAY);
        EnumSet<Day> weekendCopy = EnumSet.copyOf(weekend);
        EnumSet<Day> workingDays = EnumSet.complementOf(weekend);

        boolean week = weekend.addAll(workingDays);
        System.out.println(week);

        EnumSet<Day> overlap = EnumSet.copyOf(workingDays);
        boolean resultOverlap = overlap.retainAll(weekend2);
        System.out.println(resultOverlap);
    }
}
