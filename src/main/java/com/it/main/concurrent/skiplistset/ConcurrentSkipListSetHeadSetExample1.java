package com.it.main.concurrent.skiplistset;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate headSet() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetHeadSetExample1 {

	/*
	 * The function returns a NavigableSet which is a view of the portion of this
	 * set whose elements are strictly less than toElement.
	 */
	public static void main(String[] args) {
		
		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			set.add(i);

		// Creating a headSet object with upper limit 30
		NavigableSet<Integer> hd_set = set.headSet(30);

		// Printing the elements of the set
		System.out.println("Contents of the set: " + set);

		// Printing the elements of the headSet set
		System.out.println("Contents of the headset" + " with upper limit 30: " + hd_set);

	}

}
