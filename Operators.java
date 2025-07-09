package Core;

public class Operators {
	/*
		There are 8 types of Operators in Java.
			1. Arithmetic Operators -> +, -, *, /, %
			2. Unary Operators -> +, -, ++, --, !
			3. Ternary Operators -> condition ? if true : if false
			4. Assignment Operators -> =, +=, -=, *=, /=, %=
			5. Relational Operators -> ==, !=, <, >, <=, >=
			6. Logical Operators -> &&, ||, !
			7. Bitwise Operators -> &, |, ^, ~
			8. Shift Operators -> <<, >>, >>>
			9. Instanceof Operators -> object instance of class/subclass/interface 
	*/
	
	public static void main(String[] args) {
		
		//1. Arithmetic Operators
		int a = 10;
		int b = 3;
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		
		
		System.out.println("A + B = " + (a + b));
		System.out.println("A - B = " + (a - b));
		System.out.println("A * B = " + (a * b));
		System.out.println("A / B = " + (a / b));
		System.out.println("A % B = " + (a % b));
		
		//2. Unary Operator
		
		
		int a2 = 12;
		int b2 = 12;
		System.out.println("A2 = " + (a2++));
		System.out.println("A2 = " + (++a2));
		System.out.println("B2 = " + (b2--));
		System.out.println("B2 = " + (--b2));
		
	}
}