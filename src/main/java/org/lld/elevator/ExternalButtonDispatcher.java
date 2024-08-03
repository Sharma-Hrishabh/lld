package org.lld.elevator;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;
    DispatcherAlgorithm dispatcherAlgorithm;

    public ExternalButtonDispatcher(List<ElevatorController> elevatorControllerList,DispatcherAlgorithm dispatcherAlgorithm) {
        this.elevatorControllerList = elevatorControllerList;
        this.dispatcherAlgorithm = dispatcherAlgorithm;
    }

    public void requestLift(int floor,Direction direction){
        int liftId = dispatcherAlgorithm.findLift(floor);
        ElevatorController elevatorController = elevatorControllerList.get(liftId);
        elevatorController.acceptReq(floor,direction);
    }
}
