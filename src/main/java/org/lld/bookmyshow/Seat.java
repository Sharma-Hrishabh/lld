package org.lld.bookmyshow;

public class Seat {
    int id;
    SeatCategory category;
    int price;

    public Seat(int id, SeatCategory category, int price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

}
