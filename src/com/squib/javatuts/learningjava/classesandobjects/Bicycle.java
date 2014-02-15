package com.squib.javatuts.learningjava.classesandobjects;

public class Bicycle {

	private int cadence;
	private int gear;
	private int speed;

	public Bicycle(int startCadence, int startGear, int startSpeed) {
		gear = startGear;
		cadence = startCadence;
		speed = startSpeed;
	}

	public int getCadence() {
		return cadence;
	}

	public int getGear() {
		return gear;
	}

	public int getSpeed() {
		return speed;
	}

	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public static void main(String[] args) {
		Bicycle myBike = new Bicycle(30, 0, 8);
		System.out.println("Cadence: " + myBike.getCadence());
		System.out.println("Gear: " + myBike.getGear());
		System.out.println("Speed: " + myBike.getSpeed());
		myBike.setCadence(3);
		myBike.setGear(2);
		myBike.applyBrake(3);
		System.out.println("New cadence: " + myBike.getCadence());
		System.out.println("New gear: " + myBike.getGear());
		System.out.println("New speed: " + myBike.getSpeed());
	}
}
