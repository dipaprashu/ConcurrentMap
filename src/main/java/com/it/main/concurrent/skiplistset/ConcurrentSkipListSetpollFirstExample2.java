package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate pollFirst() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetpollFirstExample2 {

	public static void main(String[] args) {
		// Creating a set object
		ConcurrentSkipListSet<Integer> lSet = new ConcurrentSkipListSet<Integer>();

		// Printing the content of the set
		System.out.println("Contents of the set: " + lSet);

		// Retrieving and removing first element of the set
		System.out.println("The first element of the set: " + lSet.pollFirst());

	}

}
