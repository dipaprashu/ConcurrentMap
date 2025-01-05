package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate floor() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetFloorExample1 {

	/*
	 * The floor() method of java.util.concurrent.ConcurrentSkipListSet is an
	 * in-built function in Java which returns the greatest element in this set less
	 * than or equal to the given element, or null if there is no such element.
	 */
	
	/*
	 * The function throws the following exceptions:
	 * 
	 * ClassCastException – if the specified element cannot be compared with the
	 * elements currently in the set.
	 * 
	 * NullPointerException – if the specified element is null
	 */
	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Finding floor of 20 in the set
		System.out.println("The floor of 20 in the set " + lSet.floor(20));

		// Finding floor of 39 in the set
		System.out.println("The floor of 39 in the set " + lSet.floor(39));

		// Finding floor of 9 in the set
		System.out.println("The floor of 10 in the set " + lSet.floor(9));
	}

}
