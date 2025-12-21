package org.example.user_module;

import org.example.common.CarType;

public class Driver {
    public int driverId;
    String name;
    CarType carType;

    public Driver(int driverId, String name,CarType carType) {
        this.driverId = driverId;
        this.name = name;
        this.carType = carType;
    }
}
