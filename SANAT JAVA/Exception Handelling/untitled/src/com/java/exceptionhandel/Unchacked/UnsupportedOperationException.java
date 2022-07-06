package com.java.exceptionhandel.Unchacked;

import java.util.Arrays;
import java.util.List;

public class UnsupportedOperationException {
	public static void main(String[] args) {
		String str[] = { "Apple", "Banana" };
		List<String> l = Arrays.asList(str);
		System.out.println(l);

		// It will throw java.lang.UnsupportedOperationException

		l.add("Mango");
	}
}
