package Assigment_2.Structures;

import Assigment_2.interfaces.Bag;
import Assigment_2.interfaces.Iterable;
import Assigment_2.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MyBag implements Bag, Iterable {

    // == instants variable ==
    private List elements;

    // == constructor ==
    public MyBag() {
        this.elements = new ArrayList();
    }

    // == public methods ==
    @Override
    public void add(Object newElement) {
        this.elements.add(newElement);
    }

    @Override
    public void addAll(List newElements) {
        this.elements.addAll(newElements);
    }

    @Override
    public Object any() {
        Random random = new Random();
        return (isEmpty()) ? null : elements.get(random.nextInt(this.elements.size()));
    }

    @Override
    public Object remove(Object anElement) {

        if (isEmpty()) {
            return null;
        }

        List objects = new ArrayList();
        for (int i = 0; i < size(); i++) {
            if (elements.get(i).equals(anElement)) {
                objects.add(elements.get(i));
            }
        }

        if (objects.size() > 0) {
            this.elements.removeAll(objects);
            return anElement;
        }

        return null;

    }

    @Override
    public void clear() {
        this.elements.clear();
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
    public boolean contains(Object anElement) {
        for (Object element : this.elements) {
            if (element.equals(anElement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List asList() {
        return this.elements;
    }

    @Override
    public void display() {
        int count = 1;
        System.out.println();
        for (Object element : asList()) {
            System.out.println(count + ". " + element.toString());
            count++;
        }
    }

    @Override
    public Iterator asIterator() {
        return new MyIterable(this.elements);
    }
}
