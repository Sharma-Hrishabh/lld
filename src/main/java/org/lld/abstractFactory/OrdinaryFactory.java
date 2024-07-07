package org.lld.abstractFactory;

public class OrdinaryFactory implements VehicleFactory{
    @Override
    public Vehicle buyVehicle(String input) {
        switch (input) {
            case "Tata": return new OrdinaryTata();
            default: return null;
        }
    }
}
