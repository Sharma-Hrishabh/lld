//package org.lld.parkinglot;
//
//public class Entrance {
//    Vehicle vehicle;
//
//    ParkingManagerFactory parkingManagerFactory;
//
//    ParkingSpotManager parkingSpotManager;
//
//    Ticket ticket;
//
//    public Entrance(ParkingManagerFactory parkingManagerFactory) {
//        this.parkingManagerFactory = parkingManagerFactory;
//    }
//
//    public void parkVehicle(Vehicle vehicle){
//        parkingSpotManager = parkingManagerFactory.getParkingManager(vehicle);
//        ParkingSpot parkingSpot = parkingSpotManager.getParkingSpot();
//        parkingSpot.park(vehicle);
//        generateTicket(vehicle,parkingSpot);
//    }
//
//    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
//        return new Ticket(vehicle,"1231",parkingSpot);
//    }
//
//}
