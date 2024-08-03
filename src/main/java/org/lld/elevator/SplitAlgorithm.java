package org.lld.elevator;

public class SplitAlgorithm extends DispatcherAlgorithm{
    @Override
    public int findLift(int floor) {
        if(floor>3) return 1;
        else return 0;
    }
}
