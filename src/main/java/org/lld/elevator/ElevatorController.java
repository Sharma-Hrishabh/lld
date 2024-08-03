package org.lld.elevator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {
    Elevator elevator;

    PriorityQueue<Integer> minUpHeap;
    PriorityQueue<Integer> maxDownHeap;
    Queue<Integer> pendingRequestQueue;

    public ElevatorController(Elevator elevator) {
        this.elevator=elevator;
        this.minUpHeap=new PriorityQueue<>();
        this.maxDownHeap=new PriorityQueue<>((a,b)->b-a);
        this.pendingRequestQueue=new LinkedList<>();
    }

    public void acceptReq(int floor, Direction direction){
        if(Direction.UP==direction  && elevator.getCurrFloor()<floor){
            pendingRequestQueue.add(floor);
            return;
        }
        if(Direction.DOWN==direction  && elevator.getCurrFloor()>floor){
            pendingRequestQueue.add(floor);
            return;
        }

        if(direction==Direction.UP){
            minUpHeap.add(floor);
            return;
        }
        if(direction==Direction.DOWN){
            maxDownHeap.add(floor);
            return;
        }

    }

    public void controlElevator(int floor, Direction direction){

    }
}
