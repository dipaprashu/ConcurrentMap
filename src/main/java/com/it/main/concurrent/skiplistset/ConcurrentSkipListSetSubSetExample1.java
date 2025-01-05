package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate subSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetSubSetExample1 {

	/*
	 * The function returns a NavigableSet which is a view of the portion of this
	 * set whose elements range from fromElement, inclusive, to toElement,
	 * exclusive.
	 * 
	 * Exception: The function throws the following exceptions:
	 * 
	 * ClassCastException – if fromElement and toElement cannot be compared to one
	 * another using this set’s comparator (or, if the set has no comparator, using
	 * natural ordering). Implementations may, but are not required to, throw this
	 * exception if fromElement or toElement cannot be compared to elements
	 * currently in the set.
	 * 
	 * NullPointerException – if fromElement or toElement is null
	 * 
	 * IllegalArgumentException – if fromElement is greater than toElement; or if
	 * this set itself has a restricted range, and fromElement or toElement lies
	 * outside the bounds of the range.
	 */
	public static void main(String[] args) {
		
		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 0; i <= 10; i++)
			set.add(i);

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		// Creating a subsetset object
		NavigableSet<Integer> sub_set = set.subSet(2, 8);

		// Printing the elements of the descending set
		System.out.println("Contents of the subset: " + sub_set);

	}

}
