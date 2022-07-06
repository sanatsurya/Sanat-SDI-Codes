package com.java.exceptionhandel.Unchacked;

public class ArithmeticExceptionExample {
	public static void main(String args[]) {
		try {
			int x = 100 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Your input stream is error for"+ e.getMessage());
		}
		System.out.println("Cannot Divide By Zero : It's Infinity");
	}
}
