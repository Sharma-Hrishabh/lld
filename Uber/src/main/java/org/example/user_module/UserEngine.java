package org.example.user_module;

import org.example.common.CarType;

import java.util.List;

public class UserEngine {
    public List<User> users;
    public List<Driver> drivers;

    public void addUser(int userId, String name){
        users.add(new User(userId,name));
    }

    public void addDriver(int driverId, String name, CarType carType){
        drivers.add(new Driver(driverId,name, carType));
    }
}
