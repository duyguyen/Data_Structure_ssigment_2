package Assigment_2.Structures.Drafts;

import Assigment_2.interfaces.IndexableList;

import java.util.ArrayList;
import java.util.List;

public class MyIndexableListDraft implements IndexableList {

    private List element;

    public MyIndexableListDraft(){
        this.element = new ArrayList();
        build();
    }

    // == factory ==
    private void build(){
        List list1 = new ArrayList();
        list1.add(4);
        list1.add(2);
        list1.add(3);
        addAll(list1);
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public void set(int index, Object newElement) {

    }

    @Override
    public void add(Object newElement) {

    }

    @Override
    public void addAll(List newElements) {
        this.element.addAll(newElements);
    }

    @Override
    public void addAll(IndexableList newElements) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public void clear() {

    }

    @Override
    public void shuffle() {

    }

    @Override
    public void reverse() {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List asList() {
        return this.element;
    }

    @Override
    public int indexOf(Object anElement) {
        return 0;
    }

    @Override
    public boolean contains(Object anElement) {
        return false;
    }

    @Override
    public IndexableList copyFromTo(int startIndex, int stopIndex) {
        return null;
    }
}
