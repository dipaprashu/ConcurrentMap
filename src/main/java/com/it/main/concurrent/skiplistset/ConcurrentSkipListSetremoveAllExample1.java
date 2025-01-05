package com.it.main.concurrent.skiplistset;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;

/*
 * The removeAll() method of java.util.concurrent.ConcurrentSkipListSet is an in-built function in Java which returns 
 * removes from this set all of its elements that are contained in the specified collection. If the specified collection 
 * is also a set, this operation effectively modifies this set so that its value is the asymmetric set difference of the 
 * two sets.
*/

//Java program to demonstrate removeAll() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetremoveAllExample1 {

	public static void main(String[] args) {
		
		/*
		 * The function throws the following exceptions:
		 * 
		 * ClassCastException – if the types of one or more elements in this set are
		 * incompatible with the specified collection 
		 * 
		 * NullPointerException – if the specified collection or any of its elements are null Below programs
		 * illustrate the ConcurrentSkipListSet.removeAll() method:
		 */

		// Initializing the List
		List<Integer> list = new ArrayList<Integer>();

		// Adding elements in the list
		for (int i = 1; i <= 10; i += 2)
			list.add(i);

		// Contents of the list
		System.out.println("Contents of the list: " + list);

		// Initializing the set
		ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<Integer>();

		// Adding elements in the set
		for (int i = 1; i <= 10; i++)
			set.add(i);

		// Contents of the set
		System.out.println("Contents of the set: " + set);

		// Remove all elements from the set which are in the list
		set.removeAll(list);

		// Contents of the set after removal
		System.out.println("Contents of the set after removal: " + set);
	}

}
