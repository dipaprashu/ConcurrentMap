package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate higher() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetHigherNullPointerExample1 {

	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		try {
			// Trying to find higher of "null" in the set
			System.out.println("The higher of null in the set: " + lSet.higher(null));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

}
