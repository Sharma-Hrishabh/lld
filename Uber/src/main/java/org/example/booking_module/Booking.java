package org.example.booking_module;

public class Booking {
    public int userId;
    public int driverId;
    public int fare;


    public Booking(int userId, int driverId, int fare) {
        this.userId = userId;
        this.driverId = driverId;
        this.fare = fare;
    }
}
