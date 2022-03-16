import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character M/F :");
		char key = scanner.next().charAt(0);

		switch (key) {
		case 'M'|'m':
			System.out.println("Male");
			break;

		case 'F'|'f':
			System.out.println("Female");
			break;

		default:
			System.err.println("Error!");
			break;
		}
	}

}
