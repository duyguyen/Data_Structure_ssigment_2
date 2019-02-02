package Assigment_2.Structures;

import Assigment_2.Structures.Drafts.MyIndexableListDraft;
import Assigment_2.interfaces.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Test {

    /*
     *
     * CONFUSE METHODS
     * addAll(IndexableList newElements) : IndexableList interface
     * import java.util.Collections; for shuffle element : ask instructor
     *
     * */

    // == main methods ==
    public static void main(String[] args) {

        /*
         * Test MyDeque
         * */
        List list = new ArrayList();
        list.add(5);
        list.add(12);

        MyDeque myDeque = new MyDeque();

        myDeque.addToFront(0.123);
        myDeque.addToFront(123.254);

        myDeque.addToBack("thanh");
        myDeque.addToBack("nguyen");

        myDeque.addAllToBack(list);

        System.out.println("getFront() : " + myDeque.getFront());
        System.out.println("getBack() : " + myDeque.getBack());

        System.out.println("removeFront() : " + myDeque.removeFront());
        System.out.println("removeBack() : " + myDeque.removeBack());

        System.out.println("isEmpty() : " + myDeque.isEmpty());

        System.out.println();
        myDeque.display();
        System.out.println();

        System.out.println("Backward iteration".toUpperCase());
        Iterator iterator = myDeque.asBackwardIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }




        /*
         *
         * Test for MyBag
         *
         * */

       /* List list = new ArrayList();
        list.add(0.012);
        list.add("lan");
        list.add("chi");
        list.add("chi");

        MyBag myBag = new MyBag();
        myBag.add(0.002);
        myBag.addAll(list);
        System.out.println("any() : " + myBag.any());
        System.out.println("remove() : " + myBag.remove("cha"));
        System.out.println("contains() : " + myBag.contains("chi"));
//        myBag.clear();

        myBag.display();
        System.out.println();

        while(myBag.asIterator().hasNext()){
            System.out.println(myBag.asIterator().next().toString());
        }*/



        /*
         *
         * Test for IndexableList
         * */

      /*  MyIndexableListDraft myIndexableListDraft = new MyIndexableListDraft();

        int count = 1;

        MyIndexableList myIndexableList = new MyIndexableList();
        myIndexableList.add(1);
        myIndexableList.add("thanh");
        myIndexableList.add("duy");

        List list = new ArrayList();
        list.add(0.012);
        list.add("lan");
        list.add("chi");

        myIndexableList.addAll(list);
//        myIndexableList.addAll(myIndexableListDraft);
//        myIndexableList.clear();
//        myIndexableList.shuffle();
//        myIndexableList.reverse();

        System.out.println("Index of: " + myIndexableList.indexOf("trieu"));
        System.out.println("Contain: " + myIndexableList.contains("lan") + "\n");

       *//* System.out.println("copyFromTo".toUpperCase());
        int count1 = 1;
        if (myIndexableList.copyFromTo(3,5) != null){
            for (Object element:myIndexableList.copyFromTo(3,5).asList()){
                System.out.println(count1 + ". " + element.toString());
                count1++;
            }
        }*//*


        System.out.println();


        if (myIndexableList.isEmpty()){
            System.out.println("Object is empty!");
            return;
        }

        for (Object element: myIndexableList.asList()){
            System.out.println(count + ". " + element);
            count++;
        }

        System.out.println();

        Iterator iterator = myIndexableList.asBackwardIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }*/




        /*
         * Test for MyStack class
         * */
/*
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push("chi");
        myStack.push(0.001);

        List list = new ArrayList();
        list.add("thanh");
        list.add(10);
        list.add(10.0123);

        myStack.pushAll(list);
        System.out.println("pop() : " + myStack.pop());
        System.out.println("peek() : " + myStack.peek());

        System.out.println("hasNext() : " + myStack.asIterator().hasNext());


        Iterator iterator = myStack.asIterator();
        while(iterator.hasNext()){
            System.out.println("next() : " + iterator.next().toString());
        }

        System.out.println("peek() : " + myStack.asIterator().peek());

        for (Object element : myStack.asList()){
            System.out.print(element.toString() + ",");
        }*/


        /*
         * Test for MyQueue class
         * */

       /* MyQueue myQueue = new MyQueue();
        myQueue.enqueue(14);
        myQueue.enqueue(14.01);
        myQueue.enqueue("JQ");

        List list = new ArrayList();
        list.add("thanh");
        list.add(10);
        list.add(10.0123);
        myQueue.enqueueAll(list);

        System.out.println("dequeue: " +myQueue.dequeue().toString());
        System.out.println("Peek: " + myQueue.peek().toString());
        System.out.println("Size: " + myQueue.size());
        System.out.println("isEmpty: " + myQueue.isEmpty());
        System.out.println("asList: " + myQueue.asList().size());

        System.out.println();
        myQueue.display();
        System.out.println();

        while (myQueue.asIterator().hasNext()){
            System.out.println(myQueue.asIterator().next().toString());
        }*/
    }
}
