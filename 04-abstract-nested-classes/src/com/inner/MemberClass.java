package com.inner;

public class MemberClass {
	
	public static void main(String[] args) {
		//one way
		OC a = new OC();
		OC.IC b = a.new IC();
		b.print();
		
		//another way:
		new OC().new IC().print();
	}

}


class OC {
	private int x = 1;
	
	public class IC {
		private int y = 2;
		
		public void print() {
			System.out.println("x=" + x+ " " +"y="+y);
		}
	}
}
