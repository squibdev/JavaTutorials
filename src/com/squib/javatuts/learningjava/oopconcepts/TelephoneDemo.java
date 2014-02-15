package com.squib.javatuts.learningjava.oopconcepts;

class TelephoneDemo{
	
	public static void main(String[] args) {
		Telephone telephone = new Telephone();
		telephone.printState();
		telephone.printButton();
		telephone.pressButton(6);
		telephone.printButton();
		telephone.turnOff();
		telephone.printState();
		telephone.turnOn();
		telephone.printState();
	}
}
