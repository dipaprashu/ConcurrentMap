package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate pollLast() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetpollLastExample1 {

	/*
	 * The pollLast() method of java.util.concurrent.ConcurrentSkipListSet is an
	 * in-built function in Java which returns retrieves and removes the last
	 * (highest) element, or returns null if this set is empty.
	 */
	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<Integer>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Printing the content of the set
		System.out.println("Contents of the set: " + lSet);

		// Retrieving and removing Last element of the set
		System.out.println("The Last element of the set: " + lSet.pollLast());

		// Printing the content of the set after pollLast()
		System.out.println("Contents of the set after pollLast: " + lSet);
	}

}
