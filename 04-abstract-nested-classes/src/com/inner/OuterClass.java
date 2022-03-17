package com.inner;

public class OuterClass {
	private int privInt = 10;
	
	class InnerClass  {
		public void accesssOuter() {
			System.out.println("the outer class's privInt is : " + privInt);
		}
	}
	
	public void createInnerClass() {
		InnerClass inClass = new InnerClass();
		inClass.accesssOuter();
	}

}
