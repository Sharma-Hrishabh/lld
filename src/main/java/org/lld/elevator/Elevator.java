package org.lld.elevator;

public class Elevator {
    int id;
    Display display;
    Status status;
    InternalButton internalButton;
    int currFloor;

    public void move(int floor, Direction direction) {
        //do something
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCurrFloor() {
        return currFloor;
    }

    public void setCurrFloor(int currFloor) {
        this.currFloor = currFloor;
    }
}
