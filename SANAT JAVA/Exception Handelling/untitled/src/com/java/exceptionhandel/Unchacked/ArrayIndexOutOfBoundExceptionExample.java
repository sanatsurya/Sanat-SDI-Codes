package com.java.exceptionhandel.Unchacked;

import java.util.ArrayList;

public class ArrayIndexOutOfBoundExceptionExample {

	public static void main(String[] args) {
		ArrayList<String> listOfPlayers = new ArrayList<>();
		listOfPlayers.add("Rohit");
		listOfPlayers.add("Shikhar");
		listOfPlayers.add("Virat");
		listOfPlayers.add("Dhoni");
		for (String val : listOfPlayers) {
			System.out.println("Player Name: " + val);
		}

	}
}