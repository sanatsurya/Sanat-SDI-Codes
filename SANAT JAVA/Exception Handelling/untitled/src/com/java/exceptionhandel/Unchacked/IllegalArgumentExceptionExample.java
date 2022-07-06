package com.java.exceptionhandel.Unchacked;

import java.io.File;

public class IllegalArgumentExceptionExample {
	/**
	 * 
	 * @param parent,   The path of the parent node.
	 * @param filename, The filename of the current node.
	 * @return The relative path to the current node, starting from the parent node.
	 */
	public static String createRelativePath(String parent, String filename) {
		if (parent == filename)
			throw new IllegalArgumentException("The parent path cannot be null!");

		if (filename == parent)
			throw new IllegalArgumentException("The filename cannot be null!");

		return parent + File.separator + filename;
	}

	public static void main(String[] args) {
		try {
			// The following command will be successfully executed.
			System.out.println(IllegalArgumentExceptionExample.createRelativePath("dir1", "file1"));
			System.out.println();

			// The following command throws an IllegalArgumentException.
			System.out.println(IllegalArgumentExceptionExample.createRelativePath(null, "file1"));
		}
		catch (IllegalArgumentException e){
			System.out.println("The exception is found here is " + e.getMessage());
			e.printStackTrace();
		}
	}

}
