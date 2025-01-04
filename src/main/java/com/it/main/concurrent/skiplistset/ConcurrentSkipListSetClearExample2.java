package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

/* Java Program Demonstrate clear() method of ConcurrentSkipListSet() */

public class ConcurrentSkipListSetClearExample2 {
	public static void main(String[] args) {
		// Creating a set object
		ConcurrentSkipListSet<String> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		lSet.add("alex");
		lSet.add("bob");
		lSet.add("chuck");
		lSet.add("drake");
		lSet.add("eric");

		// Printing elements of the set
		System.out.println("The set contains: " + lSet);

		// Clear the set
		lSet.clear();

		// Printing elements of the set after clear operation
		System.out.println("After clear operation the set contains: " + lSet);
	}
}