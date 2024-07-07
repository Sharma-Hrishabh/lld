package org.lld.strategypattern;

public class Vehicle {
    DriveStrategy driveStrategy;
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void display(){
        System.out.println("Display");
    }
    public void drive(){
        driveStrategy.drive();
    }
}
