package org.example.fare_module;

import org.example.common.CarType;
import org.example.common.Location;

import java.util.HashMap;
import java.util.Map;

public class FareEngine {
    Map<CarType, FareStrategy> fareStrategyMap;

    public FareEngine(){
        fareStrategyMap = new HashMap<>();
        fareStrategyMap.put(CarType.GO,new GoFareStrategy());
        fareStrategyMap.put(CarType.SEDAN,new SedanFareStrategy());
    }

    public int getFare(Location pick, Location drop, CarType carType){
        return fareStrategyMap.get(carType).getFare(pick,drop);
    }


}
