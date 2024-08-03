package org.lld.parkinglot;

import java.util.List;

public interface ParkingStrategy {
    public ParkingSpot findParkingSpot(List<FourWheelerParkingSpot> parkingSpots);
}
