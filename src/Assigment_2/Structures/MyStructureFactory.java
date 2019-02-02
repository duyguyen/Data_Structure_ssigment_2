package Assigment_2.Structures;

import Assigment_2.interfaces.*;

public class MyStructureFactory implements StructureFactory {

    @Override
    public Stack newStack() {
        return new MyStack();
    }

    @Override
    public Queue newQueue() {
        return newQueue();
    }

    @Override
    public IndexableList newIndexableList() {
        return new MyIndexableList();
    }

    @Override
    public Bag newBag() {
        return new MyBag();
    }

    @Override
    public Deque newDeque() {
        return new MyDeque();
    }

    @Override
    public Stack newStack2() {
        return new MyStack2();
    }

    @Override
    public IndexableList newIndexableList2() {
        return new MyIndexableList2();
    }

    @Override
    public Bag newBag2() {
        return new MyBag2();
    }

    @Override
    public Deque newDeque2() {
        return new MyDeque2();
    }
}
