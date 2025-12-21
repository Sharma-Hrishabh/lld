package org.example.assign_module;

import org.example.common.CarType;
import org.example.common.Location;
import org.example.user_module.Driver;

import java.util.List;

public class ShortDisAssignStrategy implements AssignStrategy{


    @Override
    public Driver findDriver(Location location, CarType carType, List<Driver> drivers) {
        return drivers.get(0);
    }
}
