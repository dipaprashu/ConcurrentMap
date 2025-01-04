package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate add() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetAddExample1 {

	/*
	 * The java.util.concurrent.ConcurrentSkipListSet.add() method is an in-built
	 * function in Java which is used to insert an element in this set.
	 */
	public static void main(String[] args) {

		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 50; i += 10)
			lSet.add(i);

		// Printing elements of the set
		System.out.println("The set contains: ");
		for (Integer i : lSet)
			System.out.print(i + " ");
	}

}
