package de.ait.homework56;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDateTime;

public class EventScheduler {
    private List<Event> events;

    public EventScheduler() {
        this.events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public List<Event> getAllEvents() {
        return events;
    }

    public List<Event> getEventsOnDate(LocalDateTime date) {
        List<Event> eventsOnDate = new ArrayList<>();
        for (Event event : events) {
            if (event.getStartDateTime().toLocalDate().equals(date.toLocalDate())) {
                eventsOnDate.add(event);
            }
        }
        return eventsOnDate;
    }

    public boolean areEventsOverlapping(Event event1, Event event2) {
        return !(event1.getEndDateTime().isBefore(event2.getStartDateTime()) ||
                event2.getEndDateTime().isBefore(event1.getStartDateTime()));
    }
}
