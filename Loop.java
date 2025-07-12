package Core;

public class Loop {
	/*
	 	- In Java, loops are control flow statements used to execute a block 
	 	  of code repeatedly until a specified condition is met. 
	 	  They are essential for automating repetitive tasks, iterating over 
	 	  collections, and implementing algorithms efficiently.
	 	
	 	 - There are 4 types of loops in the java.
	 	 	1. for 
	 	 	2. while
	 	 	3. do-while
	 	 	4. for each - learn in next session
	 	 	
	 	 	1. for loop: 
	 	 		- Used when the number of iterations is known beforehand.
				- Consists of initialization, a condition, and an update statement 
				  (increment/decrement).
				  
			2. while loop:
				- Used when the number of iterations is not known beforehand, 
				  and the loop continues as long as a condition remains true.
				- The condition is checked before each iteration.
				
			3. do-while loop:
				- Similar to the while loop, but guarantees that the loop body 
				  executes at least once.
				- The condition is checked after each iteration.
				
			syntax: 
				1. for(init; condition; increment/decrement){}
				2. while(condition){body}
				3. do{body} while(condition) 
			
	 */
	
	public static void main(String[] args) {
//	1. For Loop:
		
//		int i = 0;
//		for(i= 0; i <=10; i= i+5)
//		{
//			System.out.println(i);
//			
//		}
//		int sum = 0,i=1;
//		for(i=1; i<=5; i++) {
//			sum = sum + i;
//			System.out.println(sum);
//		
//		}
//		System.out.println("Total of sum: " + sum);

//	2. Nested loop:
		
//		for(int i=1; i<=2; i++) {
//			System.out.println("Outer: " + i);
//			for(int j=1; j<=3; j++) {
//				System.out.println("     Inner: " + j);
//			}
//		}
//		int i=1, j=1, sum_i=0, sum_j=0;
//		for(i=1; i<=2; i++) {
//			System.out.println("Outer: " + i);
//			sum_i = sum_i + i;
//			for(j=1; j<=3; j++) {
//				System.out.println("     Inner: " + j);
//				sum_j = sum_j + j;
//			}
//			System.out.println("sum_j: "+ sum_j);
//		}
//		System.out.println("sum_i: " + sum_i);
		
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.print(i + " ");
//			}
//			System.out.println("");
//		}
//		System.out.println("");
//		System.out.println("");
//		for(int i=1; i<=4; i++) {
//			for(int j=1; j<=3; j++) {
//				System.out.print(j + " ");
//			}
//			System.out.println("");
//		}
		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=4;j++) {
//				System.out.print(j * j + " ");
//			}
//			System.out.println("");
//		}
//		
//		System.out.println("");
//		System.out.println("");
//		
//		for(int i=1;i<=3;i++) {
//			for(int j=1;j<=4;j++) {
//				System.out.print(i * i + " ");
//			}
//			System.out.println("");
//		}
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1;j<=10;j++) {
//				System.out.print(i * j+ " ");
//			}
//			System.out.println("");
//		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + " ");
			}
			System.out.println("");
		}
		
		System.out.println("");
		System.out.println("");
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("");
		
		int row = 5 ;
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(i + "  ");
			}
			System.out.println("");
		}
	}
}
