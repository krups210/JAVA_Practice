package Core;

public class Type_Casting {
	/*
	 	- Type casting in Java is the process of converting a variable from one data type to another. 
	 	  This is a fundamental concept in Java that allows for flexibility in data handling and operations 
	 	  between different data types.
	 	
	 	- There are 2 types of Type Casting
	 	 	1. Implicit / Automatic
	 	 	2. Explicit / Manual
	*/
	public static void main(String[] args) {
		
		// Implicit
//		int myint = 9;
//		double d = myint;
//		System.out.println("Myint = " + myint);
//		System.out.println("Myint = " + d);
//		
//		// Explicit
//		float f1 = 6.345456f;
//		double d1 = 9.45;
//		int i1 = (int) d1;
//		int i2 = (int) f1;
//		System.out.println("Float f = " + f1);
//		System.out.println("double d = " + d1);
//		System.out.println("explicit value = " + i1);
//		System.out.println("explicit value = " + i2);

//		byte b= 12;
//		int i = b;
//		System.out.println("i = " + i );
//		
//		int i1 = 1122334455;
//		byte b1 = (byte) i1;
//		System.out.println("byte is " + b1);
//		
//		int i = (int) 4.32;
//		System.out.println("int i is "+ i);
//		double d = i;
//		System.out.println("double d is " + d);
//		
		int a1 = 10;
		int b1 = 3;
		double c1 = (double)a1 / (double)b1;
		System.out.println("c = " + c1);
	}
}
