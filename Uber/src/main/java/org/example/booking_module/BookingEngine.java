package org.example.booking_module;

import org.example.assign_module.AssignEngine;
import org.example.common.CarType;
import org.example.common.Location;
import org.example.fare_module.FareEngine;
import org.example.user_module.Driver;
import org.example.user_module.User;
import org.example.user_module.UserEngine;

public class BookingEngine {

    AssignEngine assignEngine;
    FareEngine fareEngine;

    public BookingEngine(UserEngine userEngine){
        assignEngine = new AssignEngine(userEngine);
        fareEngine = new FareEngine();
    }

    public Booking makeBooking(int userId, Location pickUpLoc, Location dropLoc, CarType carType){
        // assign driver
        Driver driver = assignEngine.assignDriver(pickUpLoc, carType);
        // calculate price
        int fare = fareEngine.getFare(pickUpLoc,dropLoc,carType);
        // make booking
        Booking booking = new Booking(userId, driver.driverId,fare);
        return booking;
    }
}
