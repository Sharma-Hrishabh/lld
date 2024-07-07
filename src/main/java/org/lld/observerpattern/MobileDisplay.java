package org.lld.observerpattern;

public class MobileDisplay implements ObserverInterface {

    ObservableInterface weatherStation;
    public MobileDisplay(ObservableInterface weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println("MobileDisplay update:"+weatherStation.getData());
    }
}
