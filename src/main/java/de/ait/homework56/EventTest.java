package de.ait.homework56;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class EventTest {
    private static EventScheduler eventScheduler = new EventScheduler();
    public static void main(String[] args) {
        LocalDateTime eventFilmTerminatorStart = LocalDateTime.of(2023,12,5,2,30);
        LocalDateTime eventFilmTerminatorEnd = LocalDateTime.of(2023,12,5,4,00);
        Event eventFilmTerminator = new Event("Film Terminator",eventFilmTerminatorStart, eventFilmTerminatorEnd);

        eventScheduler.addEvent(eventFilmTerminator);

        List<Event> allEvents = eventScheduler.getAllEvents();
        for (Event event: allEvents){
            System.out.println(event.toString());
        }

        LocalDate localDate = LocalDate.of(2023,12,5);
        List<Event> result = eventScheduler.getEventsOfDateTwo(localDate);
        for (Event event: result){
            System.out.println(event.toString());
        }

        boolean checkOverlape = eventScheduler.checkEventToOverlape(eventFilmTerminator,eventFilmTerminator);
        System.out.println(checkOverlape);

        eventScheduler.deleteEvent(eventFilmTerminator);
        List<Event> resultAfterDelete = eventScheduler.getAllEvents();
        System.out.println(resultAfterDelete);
    }
}
