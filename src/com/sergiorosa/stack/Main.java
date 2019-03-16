package com.sergiorosa.stack;

import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Stack<String> deckOfCards = new Stack();
		String card1 = "Jack :Diamonds";
		String card2 = "8 : Hearts";
		String card3 = "3 : Clubs";
		
		deckOfCards.push(card1);
		deckOfCards.push(card2);
		deckOfCards.push(card3);
		
		System.out.println(deckOfCards);
		
		String top = deckOfCards.peek();
		System.out.println(top);
		
		//check the Size of the stack
		System.out.println(deckOfCards.size());
		
		//remove
		while(!deckOfCards.empty()) {
			String removedItem = deckOfCards.pop();
			System.out.println("Removed " + removedItem);
		}
	}

}
