package demosfinal;

import java.util.Date;

public class VariableExample {
	
	public  void changeValues (final int param) {
//		param = 1; compile time error
		date.setTime(0);

//		date = new Date(); compile time error
		final int localVar;
		localVar = 42;
//		localVar = 43;
	}
	
	// blank final variable
//	private final int forgottenField;
	private final int field;
	
	private final Date date = new Date();

	
	
	public static final int JAVA_CONSTANT=10;
	
	//constructor
	public VariableExample() {
		field = 100;
	}
}
