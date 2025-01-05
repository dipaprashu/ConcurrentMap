package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate descendingSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetIteratorDescExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		set.add("bob");
		set.add("alex");
		set.add("eric");
		set.add("chuck");

		// Creating a descending object
		NavigableSet<String> decSet = set.descendingSet();

		// Adding elements to the descending set and also to the set
		decSet.add("drake");
		decSet.add("fred");

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		// Printing the elements of the descending set
		System.out.println("Contents of the descending set: " + decSet);
	}

}
