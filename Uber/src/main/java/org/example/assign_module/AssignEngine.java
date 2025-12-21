package org.example.assign_module;

import org.example.common.CarType;
import org.example.common.Location;
import org.example.common.Pair;
import org.example.user_module.Driver;
import org.example.user_module.UserEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AssignEngine {
    UserEngine userEngine;
    public Map<CarType,AssignStrategy> strategyMap;
    public AssignEngine(UserEngine userEngine){
        this.userEngine  = userEngine;
        strategyMap = new HashMap<>();
        strategyMap.put(CarType.GO, new ShortDisAssignStrategy());
        strategyMap.put(CarType.SEDAN,new ShortDisAssignStrategy());
    }

    public Driver assignDriver(Location location, CarType carType){
        return  strategyMap.get(carType).findDriver(location,carType, userEngine.drivers);

    }

}
