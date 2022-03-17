package com.inner;

public class TestOuterClass {

	public static void main(String[] args) {
		
		OuterClass outClass = new OuterClass();
		
		OuterClass.InnerClass inner = outClass.new InnerClass();
		inner.accesssOuter();

	}

}
