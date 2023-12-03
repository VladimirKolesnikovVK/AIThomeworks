package de.ait.homework56;

import java.time.LocalDateTime;
import java.util.List;

public class EventTest {
    public static void main(String[] args) {
        Event event1 = new Event("Meeting", LocalDateTime.of(2023, 1, 1, 10, 0), LocalDateTime.of(2023, 1, 1, 12, 0));
        Event event2 = new Event("Conference", LocalDateTime.of(2023, 1, 1, 11, 0), LocalDateTime.of(2023, 1, 1, 14, 0));
        Event event3 = new Event("Party", LocalDateTime.of(2023, 1, 2, 20, 0), LocalDateTime.of(2023, 1, 3, 1, 0));

        EventScheduler scheduler = new EventScheduler();
        scheduler.addEvent(event1);
        scheduler.addEvent(event2);
        scheduler.addEvent(event3);

        List<Event> allEvents = scheduler.getAllEvents();
        System.out.println("All Events: " + allEvents);

        LocalDateTime specificDate = LocalDateTime.of(2023, 1, 1, 0, 0);
        List<Event> eventsOnDate = scheduler.getEventsOnDate(specificDate);
        System.out.println("Events on " + specificDate.toLocalDate() + ": " + eventsOnDate);

        boolean overlap = scheduler.areEventsOverlapping(event1, event2);
        System.out.println("Do events overlap? " + overlap);
    }
}
