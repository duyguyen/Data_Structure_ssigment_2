package Assigment_2.interfaces;

/*
In all cases below return a new (empty) data structure
for each method.

Note that you have two similar methods for some
data structure types.
E.g. newBag and newBag2.
In that case please different implementations for each of these.
In the next assignment we will do actual comparisons
to see how it lines up with our expected Big-O analysis
*/

public interface StructureFactory
{
	public Stack newStack();
	public Queue newQueue();
	public IndexableList newIndexableList();
	public Bag newBag();
	public Deque newDeque();

	public Stack newStack2();
	public IndexableList newIndexableList2();
	public Bag newBag2();
	public Deque newDeque2();
}





