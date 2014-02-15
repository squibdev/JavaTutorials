package com.squib.javatuts.learningjava.languagebasics.variables;

public class VariablesTest {

	public static void main(String args[]) {
		
		int onetwo = VariablesTest.add(1, 2);
		VariablesTest.print(onetwo);
		
	}
	
	public static int add(int var1, int var2) {
		
		// Local Variable
		int var3 = 4;
		return var1 + var2 - var3;
	}
	
	public static void print(int var) {
		System.out.println(var);
	}

	
}
