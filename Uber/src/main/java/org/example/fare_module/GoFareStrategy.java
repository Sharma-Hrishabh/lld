package org.example.fare_module;

import org.example.common.Location;

public class GoFareStrategy implements FareStrategy{
    @Override
    public int getFare(Location pickUplocation, Location dropLocation) {
        return 0;
    }
}
