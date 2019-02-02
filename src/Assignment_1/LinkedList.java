package Assignment_1;


import javax.xml.soap.Node;

public interface LinkedList {
    public void addFirst(Node element);
    public void addLast(Node element);

    public Object deleteFirst();
    public Object deleteLast();

    public void display();

    public Object getFirst();
    public Object getLast();

    public boolean isEmpty();
}
