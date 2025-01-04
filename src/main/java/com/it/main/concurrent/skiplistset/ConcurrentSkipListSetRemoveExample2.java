package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java Program Demonstrate remove() method of ConcurrentSkipListSet

public class ConcurrentSkipListSetRemoveExample2 {

	public static void main(String[] args) {

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

		// Adding elements to this set
		for (int i = 10; i <= 15; i++)
			set.add(i);

		// Printing the elements of the set
		System.out.println("The elements in the set are:");
		for (Integer i : set)
			System.out.print(i + " ");

		// remove() method will remove the specified
		// element from the set
		set.remove(1);
		set.remove(5);

		// Printing the elements of the set
		System.out.println("\nRemaining elements in set : ");
		for (Integer i : set)
			System.out.print(i + " ");

	}

}
