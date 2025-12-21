package org.example.fare_module;

import org.example.common.Location;

public interface FareStrategy {
    public int getFare(Location pickUplocation, Location dropLocation);
}
