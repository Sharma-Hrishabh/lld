package org.lld.abstractFactory;

public class AbstractFactoryPattern {
    public AbstractFactoryPattern() {
        AbstractVehicleFactory abstractVehicleFactory = new AbstractVehicleFactory();
        Vehicle v = abstractVehicleFactory.buyVehicle("BMW");
        v.buy();
    }
}
