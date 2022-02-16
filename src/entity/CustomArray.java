package entity;

import observer.ArrayEvent;
import observer.Observable;
import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class CustomArray implements Observable {
    private int[] array;
    private long id;
    private List<Observer> observers = new ArrayList<>();

    public CustomArray(int...array) {
        this.array = array;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
        notifyObservers();
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
        notifyObservers();
    }

    public int getSize() {
        return array.length;
    }

    public void setElement(int index, int value) {
        this.array[index] = value;
        notifyObservers();
    }

    public int getElement(int index) {
        return array[index];
    }

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        ArrayEvent arrayEvent = new ArrayEvent(this);
        for(Observer observer : observers)
        {
            if(observer != null)
            {
                observer.valueChanged(arrayEvent);
            }
        }
    }
}