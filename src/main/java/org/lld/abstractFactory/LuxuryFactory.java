package org.lld.abstractFactory;

public class LuxuryFactory implements VehicleFactory{
    @Override
    public Vehicle buyVehicle(String input) {
        switch (input) {
            case "BMW": return new LuxuryBMW();
            default: return null;
        }
    }
}
