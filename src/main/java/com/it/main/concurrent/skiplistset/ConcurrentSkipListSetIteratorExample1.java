package com.it.main.concurrent.skiplistset;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate descendingIterator() method of ConcurrentSkipListSet  

public class ConcurrentSkipListSetIteratorExample1 {
	/*
	 * The function returns an iterator over the elements in this set in descending
	 * order.
	 */
	public static void main(String[] args) {
		// Initializing the set
		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<String>();

		// Adding elements to this set
		set.add("Gfg");
		set.add("is");
		set.add("fun!!");

		// Returns an iterator over the elements
		Iterator<String> iterator = set.descendingIterator();

		// Printing the elements of the set
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

	}

}
