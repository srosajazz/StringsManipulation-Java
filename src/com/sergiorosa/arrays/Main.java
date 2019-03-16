package com.sergiorosa.arrays;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		
		// Create a Linked list
		LinkedList<String> students = new LinkedList<>();
		
		// Add student to the Linked List  
		students.add("Sergio"); // O(1)
		students.add("Mike");  	// O(1)
		students.add("Tony"); 	// O(1)
		students.add("Taylor"); // O(1)
		students.add("Jamie"); 	// O(1)
		
		//add front of the list // O(1)
		
		//add last of the list
		students.addLast("Jose"); // O(1)
	
		//add specific place of the list
		students.add(2, "Tara"); // O(1)
		
		//retrive first student
		String firstStudent = students.getFirst();  //O(n) lookup
		System.out.println("First: " + firstStudent);
		
		//retrive Last Student
		String lastStudent = students.getLast(); // O(n)
		System.out.println("Last: " + lastStudent);
		
		//Get the numbers students on the lonkedList  -- // O(n)
		System.out.println("numbers of Students in the LL: " + students.size());
		
		//Print out the full LL.
		System.out.println("Full list of students:" +students); // O(1)
		
		String secondStudent = students.get(1);
		System.out.println("Second: " + secondStudent);
		
		int i = students.indexOf("Taylor");
		System.out.println("Index of Taylor: " + i);
		
		//Remove items from LL 
		students.removeFirst();  //O(n)
		students.removeLast();	//O(n)
		
		//Remove by Object
		students.remove("Tony"); //O(n)
		
		//Remove by index
		students.remove(1); //O(n)
		
		System.out.println(students);
		
		//True/False
		boolean hasSergio = students.contains("Sergio"); // O(n)
		System.out.println(hasSergio);
		
		//Clear the full list of the  LL
		
		students.clear();  // O(n)
		System.out.println(students);
	}
}
