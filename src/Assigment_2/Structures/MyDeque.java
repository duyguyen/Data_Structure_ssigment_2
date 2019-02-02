package Assigment_2.Structures;

import Assigment_2.interfaces.BiDirectionalIterable;
import Assigment_2.interfaces.Deque;
import Assigment_2.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class MyDeque implements Deque, BiDirectionalIterable {

    // == instant variables ==
    private List elements;

    // == constructor ==
    public MyDeque() {
        this.elements = new ArrayList();
    }

    // == public methods ==
    @Override
    public void addToFront(Object newElement) {
        this.elements.add(0, newElement);
    }

    @Override
    public void addAllToFront(List newElements) {
        this.elements.addAll(0, newElements);
    }

    @Override
    public void addToBack(Object newElement) {
        this.elements.add(newElement);
    }

    @Override
    public void addAllToBack(List newElements) {
        this.elements.addAll(newElements);
    }

    @Override
    public Object getFront() {
        return this.elements.get(0);
    }

    @Override
    public Object getBack() {
        return this.elements.get(size() - 1);
    }

    @Override
    public Object removeFront() {
        Object front = getFront();
        this.elements.remove(front);
        return front;
    }

    @Override
    public Object removeBack() {
        Object back = getBack();
        this.elements.remove(back);
        return back;
    }

    @Override
    public List asList() {
        return this.elements;
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
    public void display() {
        int count = 1;
        for (Object object : asList()) {
            System.out.println(count + ". " + object.toString());
            count++;
        }
    }

    @Override
    public Iterator asBackwardIterator() {
        return new MyBiDirectionalIterator(this.elements);
    }

    @Override
    public java.util.Iterator iterator() {
        return null;
    }
}
