package com.it.main.concurrent;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueueExample {

	public static void main(String[] args) {

		/*
		 * ConcurrentLinkedQueue is a non-blocking off thread-safe queue. It's an
		 * inexperienced choice for plenty producer-consumer situations.
		 */
		
		 ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();  
	        queue.offer(1);  
	        queue.offer(2);  
	        queue.offer(3);  
	        for (Integer num : queue) {  
	            System.out.println(num);  
	        }  
	}

}
