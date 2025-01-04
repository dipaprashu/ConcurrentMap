package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

/* Java Program Demonstrate clear() method of ConcurrentSkipListSet() */

public class ConcurrentSkipListSetClearExample1 {
	
	/*
	 * The java.util.concurrent.ConcurrentSkipListSet.clear() method is an in-built
	 * function in Java which removes all the elements from this set.
	 */
	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Printing elements of the set
		System.out.println("The set contains: " + lSet);

		// Clear the set
		lSet.clear();

		// Printing elements of the set after clear operation
		System.out.println("After clear operation the set contains: " + lSet);

	}

}
