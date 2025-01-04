package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate clone() method of ConcurrentSkipListSet
public class ConcurrentSkipListSetCloneExample1 {

	/*
	 * The clone() method of java.util.concurrent.ConcurrentSkipListSet is an
	 * in-built function in Java which returns a shallow copy of this
	 * ConcurrentSkipListSet instance.
	 */

	public static void main(String[] args) {
		
		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 15; i++)
			set.add(i);

		// Printing elements of the set
		System.out.println("The set contains: " + set);

		// Cloning the ConcurrentSkipListSet
		ConcurrentSkipListSet<Integer> cloneSet = set.clone();

		// Adding elements to the clone set
		cloneSet.add(16);

		// Printing elements of the clone set
		System.out.println("The clone set contains: " + cloneSet);

	}

}
