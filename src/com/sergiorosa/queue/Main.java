package com.sergiorosa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList();
		
		// Enqueue items
		queue.add("Tony");
		queue.add("Sergio");
		queue.add("Heidi");
		queue.add("Susan");
		queue.add("Charles");
		
		System.out.println(queue);
		
		//peek()
		String nextInQueue = queue.peek();
		System.out.println("Next up! "+ nextInQueue);
		String recentlyRemoved = queue.remove();
		
		System.out.println(recentlyRemoved);
		System.out.println(queue);
		
		//Remove
		for( int i = 0; i < queue.size(); i++) {
			queue.remove();
			System.out.println(queue);
		}
	}
	

}
