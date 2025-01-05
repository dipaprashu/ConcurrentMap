package com.it.main.concurrent.skiplistset;

import java.util.concurrent.ConcurrentSkipListSet;

//Java program to demonstrate pollLast() method of ConcurrentSkipListSet 

public class ConcurrentSkipListSetpollLastExample2 {

	public static void main(String[] args) {

		 // Creating a set object 
        ConcurrentSkipListSet<Integer> Lset = new ConcurrentSkipListSet<Integer>(); 
  
        // Printing the content of the set 
        System.out.println("Contents of the set: " + Lset); 
  
        // Retrieving and removing Last element of the set 
        System.out.println("The Last element of the set: " + Lset.pollLast()); 
	}

}
