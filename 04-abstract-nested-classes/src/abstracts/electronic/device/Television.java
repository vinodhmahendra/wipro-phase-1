package abstracts.electronic.device;

public class Television extends ElectronicDevice {
	public void turnOn() {
		changeChannel(1);
		initializeScreen();
	}
	
	public  void turnOff() {
		
	}
	
	public void initializeScreen() {
		//implementation
	}
	
	public void changeChannel(int channel) {
		//implementation
	}
}
