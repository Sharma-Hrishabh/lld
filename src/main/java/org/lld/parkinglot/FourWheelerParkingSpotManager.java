package org.lld.parkinglot;

import java.util.List;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{


    public FourWheelerParkingSpotManager(List<FourWheelerParkingSpot> parkingSpots,ParkingStrategy parkingStrategy) {
        super(parkingSpots,parkingStrategy);
    }


}
