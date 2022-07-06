package com.java.exceptionhandel.Unchacked;

//Java program to illustrate
//FileNotFoundException

//All output and input streams
//are available in java.io package
import java.io.*;
import java.util.*;

class FileNotFound {
public static void main(String[] args) {
	
	// starting try block
	try {
		// Opening the file
		File f=new File("file.txt");
			
		// creating printWriter object
		// by initiating fileWriter
		PrintWriter p1=new PrintWriter(new FileWriter(f), true);
			
		// printing sample text
		p1.println("Hello world");
		p1.close();
		
		// changing the file operation
		// to read-only
		f.setReadOnly();
		
		// trying to write to new file
		PrintWriter p2=new PrintWriter(new FileWriter("file.txt"), true);
		p2.println("Hello World");
	}
	
	// catching exception thrown
	// by try block
	catch(Exception ex) {
		ex.printStackTrace();
	}
}
}

