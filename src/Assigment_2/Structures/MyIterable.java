package Assigment_2.Structures;

import Assigment_2.interfaces.Iterator;

import java.util.List;

public class MyIterable implements Iterator {

    // == constants variables ==
    private List elements;
    private int currentPosition;

    // == constructor ==
    public MyIterable(List elements) {
        this.elements = elements;
        this.currentPosition = 0;
    }

    @Override
    public Object next() {
        if (!hasNext()){
            return null;
        }
        Object nextElement = this.elements.get(this.currentPosition);
        currentPosition++;
        return nextElement;
    }

    @Override
    public Object peek() {
        return this.elements.get(elements.size()-1);
    }

    @Override
    public boolean hasNext() {
        return (currentPosition < elements.size()) ? true : false;
    }
}
