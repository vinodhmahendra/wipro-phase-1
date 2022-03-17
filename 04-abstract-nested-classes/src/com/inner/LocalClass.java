package com.inner;

 class OuterClass1 {
	 
	 public void print() {
		 final String s = "test: ";
		 
		 class Point {
			 private int x;
			 private int y;
			 
			 public Point(int x,int y) {
				 this.x = x;
				 this.y = y;
			 }
			 
			 public String toString() {
				 return s + "(" + x + "," +y + ")";
			 }
		 };
		 System.out.println(new Point(1,2));
	 }
 }
public class LocalClass {

	public static void main(String[] args) {
		new OuterClass1().print();
	}
}
