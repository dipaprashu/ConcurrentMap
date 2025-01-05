package com.it.main.concurrent.skiplistset;

import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate descendingIterator() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetIteratorExample2 {

	public static void main(String[] args) {
		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		set.add(10);
		set.add(15);
		set.add(20);
		set.add(25);

		// Returns an iterator over the elements
		Iterator<Integer> iterator = set.descendingIterator();

		// Printing the elements of the set
		while (iterator.hasNext())
			System.out.print(iterator.next() + " ");

	}

}
