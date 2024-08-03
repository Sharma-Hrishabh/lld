package org.lld.parkinglot;

public class Vehicle {
    VehicleType type;
    public Vehicle(VehicleType type) {
        this.type = type;
    }
    public VehicleType getVehicleType() {return type;}
}
