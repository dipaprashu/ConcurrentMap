package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate size() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetSizeExample {

	/*
	 * The java.util.concurrent.ConcurrentSkipListSet.size() method is an in-built
	 * function in Java which gives the total count of the elements present in the
	 * set.
	 */
	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 1; i <= 10; i++)
			set.add(i);

		// Printing the size of the set
		System.out.println("Number of elements in the set = " + set.size());
		// Printing the elements
		System.out.println("set : " + set);

	}

}
