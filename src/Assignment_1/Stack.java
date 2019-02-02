package Assignment_1;

import java.lang.*;
import java.util.*;

/*
pop -- pops top element (and removes)
peek -- pops top element (and does NOT removes)
*/

public interface Stack
{
	public void push(Object newObject);
	public Object pop();
	public Object peek();
	public boolean isEmpty();	
}


