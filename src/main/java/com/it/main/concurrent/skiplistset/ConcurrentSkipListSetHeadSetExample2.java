package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate headSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetHeadSetExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			set.add(i);

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		try {
			// Trying to creating a headSet object with upper limit null
			NavigableSet<Integer> hdSet = set.headSet(null);
		}
		catch (Exception e) {
			System.out.println("Exception: " + e);
		}
		// Printing the elements of the headSet set
		System.out.println("Contents of the headset" + " with upper limit 30: " + set);
	}

}
