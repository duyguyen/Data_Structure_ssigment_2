package Assigment_2.Structures;

import Assigment_2.interfaces.Iterator;

import java.util.List;

public class MyBiDirectionalIterator implements Iterator {

    // == instant variables ==
    private List elements;
    private int currentPosition;

    // == constructor ==
    public MyBiDirectionalIterator(List elements) {
        this.elements = elements;
        currentPosition = elements.size()-1;
    }



    // == public methods ==
    @Override
    public Object next() {

        if (!hasNext()){
            return null;
        }

        Object nextElement = this.elements.get(this.currentPosition);
        currentPosition--;
        return nextElement;
    }

    @Override
    public Object peek() {
        return elements.get(0);
    }

    @Override
    public boolean hasNext() {
        return (currentPosition >= 0) ? true : false;
    }
}
