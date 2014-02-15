package com.squib.javatuts.learningjava.classesandobjects;

public class Rectangle {

	int height, width;
	
	public Rectangle(Point p, int height, int width) {
		
		
	}
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	public int getArea() {
		
		int area = this.height * this.width;
		
		return area;
		
	}
	
}
