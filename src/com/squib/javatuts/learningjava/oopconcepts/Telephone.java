package com.squib.javatuts.learningjava.oopconcepts;

class Telephone implements TelephoneInterface {

	int power = 0;
	int button = 0;
	
	public void pressButton(int newButton) {
		button = newButton;
	}
	
	public void turnOn() {
		power = 1;
	}
	
	public void turnOff() {
		power = 0;
	}
	
	public void printButton() {
		System.out.println("Button Pressed: " + button);
	}
	
	public void printState() {
		System.out.println("Current State: " + power);
	}
}
