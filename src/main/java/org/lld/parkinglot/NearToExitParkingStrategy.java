package org.lld.parkinglot;

import java.util.Collections;
import java.util.List;

public class NearToExitParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<FourWheelerParkingSpot> parkingSpots) {
        Collections.reverse(parkingSpots);
        return parkingSpots.stream().filter(spot -> spot.getIsEmpty()).findFirst().orElseThrow();

    }
}
