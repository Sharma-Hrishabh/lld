package org.lld.strategypattern;

public class DefaultStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Driving default vehicle");
    }
}
