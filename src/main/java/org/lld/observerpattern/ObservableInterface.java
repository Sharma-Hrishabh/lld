package org.lld.observerpattern;


public interface ObservableInterface {
    public void addObserver(ObserverInterface observer);
    public void removeObserver(ObserverInterface observer);
    public void notifyObservers();
    public void setData(Integer data);
    public Integer getData();
}
