package Assigment_2.Structures;

import Assigment_2.interfaces.BiDirectionalIterable;
import Assigment_2.interfaces.IndexableList;
import Assigment_2.interfaces.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyIndexableList implements IndexableList, BiDirectionalIterable {

    // == instant variables ==
    private List elements;

    // == constructor ==
    public MyIndexableList() {
        this.elements = new ArrayList();
    }

    // == public methods ==
    @Override
    public Object get(int index) {
        return this.elements.get(index);
    }

    @Override
    public void set(int index, Object newElement) {
        this.elements.set(index, newElement);
    }

    @Override
    public void add(Object newElement) {
        this.elements.add(this.elements.size(), newElement);
    }

    @Override
    public void addAll(List newElements) {
        this.elements.addAll(newElements);
    }

    @Override
    public void addAll(IndexableList newElements) {
        this.elements.addAll(newElements.asList());
    }

    @Override
    public Object remove(int index) {
        Object object = this.elements.get(index);
        this.elements.remove(index);
        return object;
    }

    @Override
    public void clear() {
        this.elements.clear();
    }

    @Override
    public void shuffle() {
        Collections.shuffle(this.elements);
    }

    @Override
    public void reverse() {
        Collections.reverse(this.elements);
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0) ? true : false;
    }

    @Override
    public int size() {
        return this.elements.size();
    }

    @Override
    public List asList() {
        return this.elements;
    }

    @Override
    public int indexOf(Object anElement) {
        int index = -1;
        for (int i = 0; i < size(); i++) {
            if (this.elements.get(i).toString().equals(anElement.toString())) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public boolean contains(Object anElement) {
        return (indexOf(anElement) != -1) ? true : false;
    }

    @Override
    public IndexableList copyFromTo(int startIndex, int stopIndex) {

        if (size() == 0){
            return null;
        }

        MyIndexableList myIndexableList = new MyIndexableList();
        if (startIndex > stopIndex){
            System.out.println("Wrong inputs! " + startIndex + " is not greater than " + stopIndex + ".");
            return myIndexableList;
        }

        for (int i = startIndex; i <= stopIndex; i++){
            myIndexableList.add(this.elements.get(i));
        }
        return myIndexableList;
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
