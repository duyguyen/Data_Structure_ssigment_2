package Assigment_2.interfaces;
import java.util.*;

public interface Stack
{
	//Adding
	public void push(Object newElement);	//adds new top element
	public void pushAll(List newElements);	//adds new top elements (in order received)

	//Getting
	public Object pop();	//removes top element
	public Object peek();	//returns top element (does not remove)

	//Querying
	public int size();
	public boolean isEmpty();
	public List asList();

}




