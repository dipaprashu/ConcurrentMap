package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate removeAll() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetremoveAllNullPointerExample {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

		// Adding elements in the set
		for (int i = 1; i <= 10; i++)
			set.add(i);

		// Contents of the set
		System.out.println("Contents of the set: " + set);

		try {
			// Remove all elements from the set which are null
			set.removeAll(null);
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

}
