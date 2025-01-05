package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate floor() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetFloorExample2 {

	public static void main(String[] args) {
		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Trying to find the floor of null
		try {
			System.out.println("The floor of null in the set " + lSet.floor(null));
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

}
