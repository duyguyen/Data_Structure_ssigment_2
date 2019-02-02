
package Assigment_2.interfaces;

/*

The BiDirectionalIterable extends Iterable and adds:
	asBackwardIterator()

When a class implements BiDirectionalIterable it will
implement asIterator (forward is default/implied)
and asBackwardIterator.

For example,
	Given a simple ordered collection:
		A, B, C, D

	- If we asked for an iterator (default/forward).
	We would expect the iterator to visit A-B-C-D.

	- If we asked for a backward iterator we would expect
	the iterator to visit D-C-B-A.

*/

public interface BiDirectionalIterable extends java.lang.Iterable
{
	public Iterator asBackwardIterator();
}



