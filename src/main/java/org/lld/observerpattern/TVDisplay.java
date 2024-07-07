package org.lld.observerpattern;

public class TVDisplay implements ObserverInterface{

    ObservableInterface weatherStation;

    public TVDisplay(ObservableInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("Updated on TV: "+weatherStation.getData());
    }
}
