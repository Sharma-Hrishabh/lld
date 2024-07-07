package org.lld.abstractFactory;

public class AbstractVehicleFactory {
    LuxuryFactory luxuryFactory;
    OrdinaryFactory ordinaryFactory;
    public AbstractVehicleFactory() {
        luxuryFactory = new LuxuryFactory();
        ordinaryFactory = new OrdinaryFactory();
    }

    public Vehicle buyVehicle(String input) {
        switch (input) {
            case "BMW":  return luxuryFactory.buyVehicle(input);
            case "Tata":  return ordinaryFactory.buyVehicle(input);
            default: return null;
        }
    }
}
