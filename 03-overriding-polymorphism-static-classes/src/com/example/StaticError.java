package com.example;

public class StaticError {
	
	private int x  ;// instance variable
	
	public static void staticMethod() {
//		x = 1; // compile errors
//		instanceMethod(); compile error
	}

	public void instanceMethod() {
		x = 2;
		staticMethod();
	}
}
