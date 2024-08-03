package org.lld.parkinglot;

public class Ticket {
    Vehicle vehicle;
    String entryTime;
    ParkingSpot parkingSpot;

    public Ticket(Vehicle vehicle, String entryTime, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.entryTime = entryTime;
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "vehicle=" + vehicle +
                ", entryTime='" + entryTime + '\'' +
                ", parkingSpot=" + parkingSpot.getId() +
                '}';
    }
}
