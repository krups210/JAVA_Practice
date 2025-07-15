package Core;

import java.util.Scanner;

/*
	- In Java, the most common and versatile way to handle user input
	  from the console is by using the Scanner class, which is part of the 
	  java.util package.
	- Here's a breakdown of how to use the Scanner class to get various types of 
	  input: Import the Scanner class.
*/

class call{
	public void data() {
		System.out.println("data function in call class");
	}
}

public class User_Input {
	public static void main(String[] args) {
		
		call c = new call();
		c.data();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a value:");
		int a = sc.nextInt();
		
		System.out.println("Enter b value");
		int b = sc.nextInt();
		
		System.out.println("Total a + b is : " + (a+b));
		
		System.out.println("enter value conver in double datatype: ");
		double d = sc.nextDouble();
		System.out.println("conver value is: " + d);
	}
}
