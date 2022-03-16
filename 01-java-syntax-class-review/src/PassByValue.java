
public class PassByValue {

	public static void main(String[] args) {
		int x = 50;
		PassByValue pv = new PassByValue();
		pv.callByValue(x);
		System.out.println(x);
	}

	void callByValue(int y) {
		y = 100;
	}
}
