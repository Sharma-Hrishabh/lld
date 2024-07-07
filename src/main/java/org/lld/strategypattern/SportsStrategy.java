package org.lld.strategypattern;

public class SportsStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Drive Sports Strategy");
    }
}
