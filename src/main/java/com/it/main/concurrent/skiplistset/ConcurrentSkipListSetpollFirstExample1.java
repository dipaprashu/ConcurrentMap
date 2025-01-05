package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate pollFirst() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetpollFirstExample1 {
	/*
	 * The pollFirst() method of java.util.concurrent.ConcurrentSkipListSet is an
	 * in-built function in Java which returns retrieves and removes the first
	 * (lowest) element, or returns null if this set is empty.
	 */
	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Printing the content of the set
		System.out.println("Contents of the set: " + lSet);

		// Retrieving and removing first element of the set
		System.out.println("The first element of the set: " + lSet.pollFirst());

		// Printing the content of the set after pollFirst()
		System.out.println("Contents of the set after pollFirst: " + lSet);
	}

}
