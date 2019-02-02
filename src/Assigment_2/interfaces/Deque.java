package Assigment_2.interfaces;

import java.util.*;

public interface Deque
{
	//Adding
	public void addToFront(Object newElement);		//front or head
	public void addAllToFront(List newElements);
	public void addToBack(Object newElement);		//back or rear or tail
	public void addAllToBack(List newElements);

	//Getting
	public Object getFront();	//Return object at front (do not remove)
	public Object getBack();	//Return object at back (do not remove)

	//Removing
	public Object removeFront();	//Remove and return object at front
	public Object removeBack();		//Remove and return object at front

	//Querying
	public List asList();
	public int size();
	public boolean isEmpty();

	//Displaying
	public void display();	//Show all elements using toString (sent to "each" element)
}



