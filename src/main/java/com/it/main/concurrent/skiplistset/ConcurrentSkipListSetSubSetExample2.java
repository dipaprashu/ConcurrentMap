package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate subSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetSubSetExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 0; i <= 10; i++)
			set.add(i);

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		try {
			// Creating a subsetset object
			NavigableSet<Integer> sub_set = set.subSet(2, null);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

}
