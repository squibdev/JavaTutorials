package com.squib.javatuts.learningjava.languagebasics.variables;

class ArrayCopyDemo {

	public static void main(String[] args) {
		char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
				'i', 'n', 'a', 't', 'e', 'd'};
		
		// Copies from copyFrom and pastes into copyTo
		// Basic way to perform arraycopy
		// char[] copyTo = new char[7];
		// System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		
		// Faster copy method, using java.util.Arrays class
		char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);
		
		System.out.println(new String(copyTo));
	}
	
	// Useful array methods
	// binarySearch(): searches an array for a value and returns index location
	// equals():       compares two arrays to determine if they are equal
	// fill():         adds a specific value to each index
	// sort():         sorts array in ascending or descending order
}
