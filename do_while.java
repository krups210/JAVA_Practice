package Core;

public class do_while {
	/*
	 	The do-while loop in Java is a control flow statement that 
	 	facilitates the repeated execution of a block of code. 
	 	Unlike the while loop, the do-while loop guarantees that the code 
	 	block within the loop will execute at least once, regardless of whether
	 	the condition is initially true or false
	 */
	public static void main(String[] args) {
		
//		int count = 0;
//		do {
//			System.out.println("Count is: "+ count);
//			count++;
//		}while(count <=5);
		
//		int i = 10;
//		do {
//			System.out.println("i is " + i);
//			i++;
//		}while(i<5);
		
		int c= 1;
		do {
			System.out.println("Print Hello word! "+ c);
			c++;
		}while(c<6);
	}
	
}
