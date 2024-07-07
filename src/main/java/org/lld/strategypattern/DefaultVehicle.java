package org.lld.strategypattern;

public class DefaultVehicle extends Vehicle{
    public DefaultVehicle(DriveStrategy driveStrategy){
        super(driveStrategy);
    }
}
