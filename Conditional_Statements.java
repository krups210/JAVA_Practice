package Core;

public class Conditional_Statements {
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
		/*
		int mynum = 10;
		if(mynum > 0 & mynum <= 10) {
			System.out.println("my number is positive");
		}else if(mynum > 10) {
			System.out.println("my number is grater than 10");
		}else if (mynum < 0 ){
			System.out.println("mu number is negative");
		}else {
			System.out.println("value is zero");
		}*/
		
		// else if ladder
		/*int mark = 101;
		if(mark < 35) {
			System.out.println("Fail");
		}else if(mark >=35 && mark <=60) {
			System.out.println("D Grade");
		}else if(mark >=61 && mark <=70) {
			System.out.println("C Grade");
		}else if(mark >=71 && mark <=80) {
			System.out.println("B Grade");
		}else if(mark >=81 && mark <= 100) {
			System.out.println("A Grade");
		}else {
			System.out.println("Invali Input");
		}*/
		
		// switch case
		System.out.println("1.Gujarati 2.Hindi 3.English");
		System.out.println();
		int choice = 4;
		switch (choice) {
		case 1: 
			System.out.println("You selected " + choice + "st choice:: Gujarati");
			break;

		case 2:
			System.out.println("You selected " + choice + "nd choice:: Hindi");
			break;
			
		case 3:
			System.out.println("You selected " + choice + "rd choice:: English");
			break;
			
		default: 
			System.out.println("Invalid Input choice:: " + choice);
			break;
		}
		
			
	}
	
}

