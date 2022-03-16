import java.util.Scanner;

public class SwitchStringStatement {

	public static void main(String[] args) {
//		String color = "Blue";
		String shirt = " Shirt";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Color:");
		String color = scanner.next();
		
		switch (color) {
		
		
		case "Blue":
			shirt = "Blue" + shirt;
			break;
		case "Red":
			shirt = "Red" + shirt;
			break;
		default:
			shirt = "White" + shirt;
		}

		System.out.println("Shirt type: " + shirt);
	}

}
