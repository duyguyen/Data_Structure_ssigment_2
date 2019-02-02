package Assignment_1;

import javax.xml.soap.Node;

public interface Queue {
    public void enqueue(Node element);
    public Object dequeue();
    public Object peek();
    public boolean isEmpty();
}
