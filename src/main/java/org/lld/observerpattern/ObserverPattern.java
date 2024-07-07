package org.lld.observerpattern;

public class ObserverPattern {

    public ObserverPattern(){

        ObservableInterface weatherStation = new WeatherStation();
        ObserverInterface tvDisplay = new TVDisplay(weatherStation);
        ObserverInterface mobileDisplay = new MobileDisplay(weatherStation);
        weatherStation.addObserver(tvDisplay);
        weatherStation.addObserver(mobileDisplay);

        for(int i=1;i<=5;i++){
            weatherStation.setData(i);
        }
    }



}
