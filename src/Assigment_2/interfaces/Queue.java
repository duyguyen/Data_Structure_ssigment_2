package Assigment_2.interfaces;

import java.util.*;

public interface Queue
{
	//Adding
	public void enqueue(Object newElement);		//add element to back/rear/tail
	public void enqueueAll(List newElements);	//adds elements to back (in order received)

	//Getting
	public Object dequeue();	//remove and return (from front/head)
	public Object peek();		//peek (from front/head)

	//Querying
	public int size();
	public boolean isEmpty();
	public List asList();

	//Displaying
	public void display();	//Show all elements using toString (sent to "each" element)
}





