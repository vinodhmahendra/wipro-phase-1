
public class Strings {
	public static void main(String[] args) {
		char letter = 'a';

		String string1 = "Hello";
		String string2 = " World!";
		String string3 = "";

		String dontDoThis = new String("Bad Practice");

		String s1 = "A";
		String s2 = "A";
		
		System.out.println("(s1 == s2) :" + (s1==s2)); //true
		
		String s3 = new String("A");
		String s4 = new String("A");
		System.out.println("(s3 == s4) : " + (s3 == s4)); // false
		
		string3 = string1 + string2;
		System.out.println("Output: " + string3+ " " + letter);
	}

}
