package com.squib.javatuts.learningjava.classesandobjects;

public class PassPrimitiveByValue {

	public static void main(String[] args) {

		int x = 3;

		passMethod(x);

		System.out.println("After invoking passMethod, x = " + x);

	}

	// The value of the parameter p is lost when passMethod(x) is called
	public static void passMethod(int p) {
		p = 10;
	}

}
