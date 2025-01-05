package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate descendingSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetIteratorDescExample1 {

	/*
	 * The function returns a NavigableSet which is a reverse order view of this
	 * set.
	 */
	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		set.add(10);
		set.add(35);
		set.add(20);
		set.add(25);

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		// Creating a descending set object
		NavigableSet<Integer> des_set = set.descendingSet();

		// Printing the elements of the descending set
		System.out.println("Contents of the descending set: " + des_set);
	}

}
