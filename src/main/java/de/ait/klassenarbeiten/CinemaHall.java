package de.ait.klassenarbeiten;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CinemaHall {
    private int hallNumber;
    private List<Movie> moviesSchedule;

    public CinemaHall(int hallNumber) {
        this.hallNumber = hallNumber;
        this.moviesSchedule = new ArrayList<>();
    }

    public void addMovie(Movie movie) throws ScheduleConflictException{
        for (Movie existingMovie : moviesSchedule) {
            if (movie.isTimeConflict(existingMovie)) {
                throw new ScheduleConflictException("Конфликт расписания с фильмом: " + existingMovie.getTitle());
            }
        }
        moviesSchedule.add(movie);
    }
    public boolean isScheduleConflict(LocalDateTime newMovieStart, LocalDateTime newMovieEnd){
        Movie temporary = new Movie("Temporary", newMovieStart, newMovieEnd);
        for (Movie existingMovie : moviesSchedule) {
            if (temporary.isTimeConflict(existingMovie)) {
                return true;
            }
        }
        return false;
    }

    /*public void bookTicket(String title, int tickets){
        for (Movie movie: moviesSchedule){
            if (title.equals(movie.getTitle())){
                if (movie.getAvailableTickets() >= tickets){
                    movie.setAvailableTickets(movie.getAvailableTickets() - tickets);
                }
                else {
                    throw new SoldOutException("not enough tickets available Available: " + movie.getAvailableTickets() + "tickets: " + tickets);
                }
            }
        }
        if(moveWasFound == false){
        LOGGER.warn("movie was found {} " + title);
        }
    }*/


}
