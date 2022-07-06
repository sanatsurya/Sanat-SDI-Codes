package com.java.exceptionhandel.Unchacked;

import java.lang.reflect.*;

public class ClassgetFieldExample1 {

	public static void main(String[] args) {

		ClassgetFieldExample1 obj = new ClassgetFieldExample1();
		Class class1 = obj.getClass(); // gets the class

		System.out.println("Field got  =");
		try {

			Field Flds = class1.getField("str");
			System.out.println(" field found: " + Flds.toString());
		} catch (NoSuchFieldException e) {
			System.out.println(e.toString());
		}
	}

	public ClassgetFieldExample1() {
	}

	public ClassgetFieldExample1(String str) {
		this.str = str;
	}

	public String str = "javaTpoint";
}
