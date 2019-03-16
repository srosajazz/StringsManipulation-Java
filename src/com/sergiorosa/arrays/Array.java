package com.sergiorosa.arrays;

import java.util.Arrays;

/**
 * PET SHOP STORE
 *
 * Java Course
 */

public class Array {
	
	public static boolean isItemInArray(String item, String[] items) {
		for(String i : items) {
			if(i.toLowerCase().equals(item)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		//Declare an Array
		int[] nums;
		
		//Declaring and allocate an Array
		double[] otherNums = new double[5];
		
		//Declaring, allocating, and initializing an array
		String[] availablePets = {"cat", "dog", "fish"};
		String[] unavailablePets = {"bird", "rabbit", "hamster", "bird"};
		
		System.out.println(Arrays.toString(availablePets));
		System.out.println(Arrays.toString(unavailablePets));
		
		//swap fish with -> bird
		int indexOfAvailablePet = 2;	// index of fish
		int indexOfUnavailablePet = 0; // index of bird
		
		//Available and Unavailable pets variables
		String availablePet = availablePets[indexOfAvailablePet]; // fish
		String unavailablePet = unavailablePets[indexOfUnavailablePet]; // bird
		
		availablePets[indexOfAvailablePet] = unavailablePet;
		unavailablePets[indexOfUnavailablePet] = availablePet;
		
		System.out.println();
		
		System.out.println(Arrays.toString(availablePets));
		System.out.println(Arrays.toString(unavailablePets));

	}

}
