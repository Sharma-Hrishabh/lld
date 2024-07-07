package org.lld.strategypattern;

public class StrategyPattern {

        /*
         Whenever you want some function of a class to behave differently for subclasses, then convert that function to strategy by making an interface
        */

        public StrategyPattern(){
            Vehicle sports= new SportsVehicle(new SportsStrategy());
            Vehicle defaultv= new DefaultVehicle(new DefaultStrategy());

            sports.drive();
            sports.display();

            defaultv.drive();
            defaultv.display();
        }

}
