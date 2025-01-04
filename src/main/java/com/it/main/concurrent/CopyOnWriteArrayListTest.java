package com.it.main.concurrent;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;  

public class CopyOnWriteArrayListTest {
	
	/*
	 * CopyOnWriteArrayList is a thread-stable listing wherein adjustments create a
	 * modern day duplicate of the underlying array. It ensures that the actual list
	 * stays unaltered in some unspecified time in the future of generation via
	 * other threads.
	 */
	public static void main(String[] args) {
		List<Integer> list=new CopyOnWriteArrayList<>();
	        list.add(1);  
	        list.add(2);  
	        list.add(3);  
	        for (Integer num : list) {  
	            System.out.println(num);  
	        }  
	}

}
