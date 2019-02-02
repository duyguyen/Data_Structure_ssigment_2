package Assignment_1;

import java.lang.*;
import java.util.*;

public interface IndexedList
{
	public void add(Object o);
	public void addAll(IndexedList otherList);
	public void addAll(List otherList);
	public Object get(int index);
	public void setObject(int index, Object o);
}