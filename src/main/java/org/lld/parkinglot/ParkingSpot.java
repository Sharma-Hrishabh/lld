package org.lld.parkinglot;

public abstract class ParkingSpot {
    int id;
    Boolean isEmpty;
    Vehicle vehicle;
    int price;

    public Boolean getIsEmpty() {return isEmpty;}

    public void park(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty=false;
    }

    public void unpark(Vehicle vehicle) {
        this.vehicle = null;
        isEmpty=true;
    }

    public int getId() {return this.id;}

    public abstract int getPrice();
}
