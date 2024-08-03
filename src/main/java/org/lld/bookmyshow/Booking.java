package org.lld.bookmyshow;

import java.util.List;

public class Booking {
    int id;
    List<Seat> seats;
    Payment payment;

    public Booking(int id, List<Seat> seats, Payment payment) {
        this.id = id;
        this.seats = seats;
        this.payment = payment;
    }
}
