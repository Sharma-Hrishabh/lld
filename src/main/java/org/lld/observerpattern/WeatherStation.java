package org.lld.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements ObservableInterface{
    List<ObserverInterface> observers;
    Integer temp;

    @Override
    public void addObserver(ObserverInterface observer) {
        if(observers==null){
            observers=new ArrayList<>();
        }
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        if(observers!=null){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(observer -> observer.update());
    }

    @Override
    public void setData(Integer data) {
        temp=data;
        notifyObservers();
    }

    @Override
    public Integer getData() {
        return this.temp;
    }


}
