package com.it.main.concurrent;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class SkipListSetExample {

	public static void main(String[] args) {

		/*
		 * ConcurrentSkipListSet is a thread-secure implementation of a SortedSet the
		 * use of a skip list. It allows elements to be saved in a taken care of order
		 * and helps concurrent get entry to
		 */
		 NavigableSet<Integer> set = new ConcurrentSkipListSet<>();  
	        set.add(3);  
	        set.add(1);  
	        set.add(2);  
	        for (Integer num : set) {  
	            System.out.println(num);  
	        }  
	}

}
