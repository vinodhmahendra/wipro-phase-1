import java.util.Scanner;

public class NumericLiterals {

	public static void main(String[] args) {
		int x = 0156;
		int hex = 0x6E;
		System.out.println(hex);

		long socialSecurityNumber = 999_99_9999L;
		
//		long SOCIALSECURITYNUMBER = 89_99;
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		System.out.println("the input is : " + input);
		
	}

}
