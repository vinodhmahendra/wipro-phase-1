package com.example;

public class Box {

	private double lenght,width,height;
	
	public Box() {
		this.lenght = 1;
		this.width = 1;
		this.height = 1;
	}
	
	public Box(double lenght) {
		this.width = this.lenght = this.height = lenght;
	}

	public Box(double lenght, double width, double height) {
		this.lenght = lenght;
		this.width = width;
		this.height = height;
		System.out.println(" and the height of " + height + " .");
	}
	
	double volume() {
		return width * height * lenght;
	}
	
	public static void main(String[] args) {
		double vol ;
		Box mybox1 = new Box();
		Box mybox2 = new Box(5.5);
		
		Box mybox3 = new Box(2.3,4.5,6.6);
		
		vol = mybox1.volume();
		System.out.println( " volume of mybox1 " + vol);
		
		vol = mybox2.volume();
		System.out.println( " volume of mybox2 " + vol);
		
		vol = mybox3.volume();
		System.out.println( " volume of mybox3 " + vol);
		
	}
}
