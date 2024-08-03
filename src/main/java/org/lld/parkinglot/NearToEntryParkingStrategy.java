package org.lld.parkinglot;

import java.util.List;

public class NearToEntryParkingStrategy implements ParkingStrategy{
    @Override
    public ParkingSpot findParkingSpot(List<FourWheelerParkingSpot> parkingSpots) {
        return parkingSpots.stream().filter(spot -> spot.getIsEmpty()).findFirst().orElseThrow();
    }
}
