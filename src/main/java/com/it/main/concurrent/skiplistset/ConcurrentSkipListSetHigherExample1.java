package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate higher() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetHigherExample1 {

	/*
	 * The higher(E e) method of java.util.concurrent.ConcurrentSkipListSet is an
	 * in-built function in Java which returns the least element in this set
	 * strictly greater than the given element, or null if there is no such element.
	 * 
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

		// Finding higher of 20 in the set
		System.out.println("The higher of 20 in the set: " + lSet.higher(20));

		// Finding higher of 39 in the set
		System.out.println("The higher of 39 in the set: " + lSet.higher(39));

		// Finding higher of 50 in the set
		System.out.println("The higher of 50 in the set: " + lSet.higher(50));

	}

}
