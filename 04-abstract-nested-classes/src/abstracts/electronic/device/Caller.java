package abstracts.electronic.device;

public class Caller {

	public static void main(String[] args) {
		
//		ElectronicDevice dev = new ElectronicDevice(); cannot create object of abstract class
		
		ElectronicDevice dev = new Television();
		dev.turnOn();
	}

}
