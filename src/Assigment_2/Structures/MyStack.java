package Assigment_2.Structures;

import Assigment_2.interfaces.Iterable;
import Assigment_2.interfaces.Iterator;
import Assigment_2.interfaces.Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack implements Stack, Iterable {

    // == constant variables ==
    private List elements;

    // == constructor ==
    public MyStack() {
        elements = new ArrayList() {};
    }

    // == public methods ==
    @Override
    public void push(Object newElement) {
        this.elements.add(0, newElement);
    }

    @Override
    public void pushAll(List newElements) {
        this.elements.addAll(0, newElements);
    }

    @Override
    public Object pop() {
        Object firstElement = this.elements.get(0);
        this.elements.remove(0);
        return firstElement;
    }

    @Override
    public Object peek() {
        return this.elements.get(0);
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0) ? true : false;
    }

    @Override
    public List asList() {
        return elements;
    }

    @Override
    public Iterator asIterator() {
        return new MyIterable(this.elements);
    }
}
