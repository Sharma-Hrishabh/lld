package org.lld.parkinglot;

import java.util.List;

public  class  ParkingSpotManager {
    List<FourWheelerParkingSpot> parkingSpots;
    ParkingStrategy parkingStrategy;

    public ParkingSpotManager( List<FourWheelerParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        this.parkingSpots = parkingSpots;
        this.parkingStrategy = parkingStrategy;
    }

    public ParkingSpot getParkingSpot(){
        return parkingStrategy.findParkingSpot(parkingSpots);
    }

}
