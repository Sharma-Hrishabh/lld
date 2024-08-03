package org.lld.bookmyshow;

import java.util.ArrayList;
import java.util.List;

public class Show {
    int id;
    Movie movie;
    Screen screen;
    int startTime;

    List<Integer> bookedSeatIds;

    public Show(int id, Movie movie, Screen screen, int startTime) {
        this.id = id;
        this.movie = movie;
        this.screen = screen;
        this.startTime = startTime;
        this.bookedSeatIds = new ArrayList<>();
    }

    public void bookSeat(int seatId) {
        bookedSeatIds.add(seatId);
    }
}
