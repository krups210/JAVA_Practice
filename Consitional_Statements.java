package Core;

public class Consitional_Statements {
	/*
	 	- Conditional statements in Java enable programs to make decisions and execute different blocks of code based 
	 	  on whether specific conditions are met. These statements are fundamental for controlling the flow of 
	 	  execution within a program.
		- There are 5 types of Conditional statements
			1. Simple if
			2. if else
			3. nested if
			4. else if ladder
			5. switch case
					
	 */

	public static void main(String[] args) {
		
		
		
		//int a = 56;
		//int b = 8;
		//int c = a+b;
		//System.out.println("C = " + c);
		
		//1. simple if
		/*if (a < b) {
			System.out.println("A less than B");
		}*/
		
		
		//2. if else
		/*if (c == 13) {
			System.out.println("C is matched");
		}
		else {
			System.out.println("C is not matched");
		}*/
		
		//3. nested if
		/*if (a > 18) {
			System.out.println("Age is greater than 18");
			if(a < 55) {
				System.out.println("You are eligible");
			}
			else {
				System.out.println("Age is greater then 18 but not less than 55");
			}
		}
		else {
			System.out.println("Age is less than 18");
		}*/
		
		int mynum = 10;
		if(mynum > 0 & mynum <= 10) {
			System.out.println("my number is positive");
		}else if(mynum > 10) {
			System.out.println("my number is grater than 10");
		}else if (mynum < 0 ){
			System.out.println("mu number is negative");
		}else {
			System.out.println("value is zero");
		}
	}
	
}

