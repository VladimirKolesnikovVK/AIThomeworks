package de.ait.homework56;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class EventScheduler {
    private List<Event> eventList;

    public EventScheduler() {
        this.eventList = new ArrayList<>();
    }

    public void addEvent(Event eventToAdd) {
        eventList.add(eventToAdd);
    }

    public void deleteEvent(Event eventToDelete) {
        eventList.remove(eventToDelete);
    }

    public List<Event> getAllEvents() {
        return eventList;
    }

    public List<Event> getEventsOfDate(LocalDate localDate) {
        List<Event> fundEvents = new ArrayList<>();
        for (Event event: eventList){
            if (event.getStartDateTime().toLocalDate().equals(localDate)){
                fundEvents.add(event);
            }
        }
        return fundEvents;
    }

    public List<Event> getEventsOfDateTwo(LocalDate localDate) {
        List<Event> fundEvents = new ArrayList<>();
        for (Event event : eventList) {
            //if (event.getStartDateTime().getDayOfYear()...)
            if (event.getStartDateTime().getDayOfMonth() == localDate.getDayOfMonth() &&
                    event.getStartDateTime().getMonth() == localDate.getMonth() &&
                    event.getStartDateTime().getYear() == localDate.getYear()) {
                fundEvents.add(event);
            }
        }
        return fundEvents;
    }

    public boolean checkEventToOverlape(Event eventOne, Event eventTwo){
        return eventOne.getStartDateTime().isBefore(eventTwo.getEndDateTime()) &&
                eventTwo.getStartDateTime().isBefore(eventOne.getEndDateTime());

    }
}
