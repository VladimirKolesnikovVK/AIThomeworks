package de.ait.klassenarbeiten;

public class AvailableSeats {
    private int calculateAvailableSeats(Movie[] moviesSchedule) {
        int totalSeats = 100;
        int bookedSeats = 0;

        for (Movie movie : moviesSchedule) {
            //bookedSeats += movie.getBookedSeats();
        }
        return totalSeats - bookedSeats;
    }
}
