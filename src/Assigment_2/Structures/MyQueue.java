package Assigment_2.Structures;

import Assigment_2.interfaces.Iterable;
import Assigment_2.interfaces.Iterator;
import Assigment_2.interfaces.Queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue implements Queue, Iterable {

    // == instant variables ==
    private List elements;

    // == constructor ==
    public MyQueue() {
        elements = new ArrayList();
    }

    // == public methods ==
    @Override
    public void enqueue(Object newElement) {
        this.elements.add(newElement);
    }

    @Override
    public void enqueueAll(List newElements) {
        this.elements.addAll(newElements);
    }

    @Override
    public Object dequeue() {
        Object headElement = this.elements.get(0);
        this.elements.remove(0);
        return headElement;
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
        return this.elements;
    }

    @Override
    public void display() {
        if (size() == 0){
            System.out.println("Elements is empty!");
            return;
        }
        int count = 1;
        for (Object element: elements){
            System.out.println(count + ". " + element.toString());
            count++;
        }
    }

    @Override
    public Iterator asIterator() {
        return new MyIterable(this.elements);
    }
}
