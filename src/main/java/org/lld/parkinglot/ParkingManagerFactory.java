//package org.lld.parkinglot;
//
//import java.util.List;
//
//public class ParkingManagerFactory {
//
//    List<ParkingSpot> parkingSpots ;
//
//    public ParkingManagerFactory(List<ParkingSpot> parkingSpots) {
//        this.parkingSpots=parkingSpots;
//    }
//    public ParkingSpotManager getParkingManager(Vehicle v){
//        if(v.getVehicleType().equals(VehicleType.FOURWHEELER)) return new FourWheelerParkingSpotManager(parkingSpots,new NearToExitParkingStrategy());
//        return new TwoWheelerParkingSpotManager(parkingSpots,new NearToEntryParkingStrategy());
//    }
//}
