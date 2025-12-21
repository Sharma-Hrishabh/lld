package org.example;

import org.example.booking_module.Booking;
import org.example.booking_module.BookingEngine;
import org.example.common.CarType;
import org.example.common.Location;
import org.example.user_module.UserEngine;

public class Main {
    public static void main(String[] args)
    {
        UserEngine userEngine = new UserEngine();
        userEngine.addUser(1,"Hrishabh");
        userEngine.addDriver(1,"Ram", CarType.GO);
        userEngine.addDriver(2,"shyyam",CarType.SEDAN);

        BookingEngine bookingEngine = new BookingEngine(userEngine);
        Booking booking = bookingEngine.makeBooking(1,new Location(1,2), new Location(3,4), CarType.SEDAN);

    }
}