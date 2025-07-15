package Core;

public class while_loop {
	
	/* A while loop in Java is a control flow statement that repeatedly executes 
	   a block of code as long as a specified boolean condition evaluates to true.
	*/
	
	public static void main(String[] args) {
		
//		int j=1;
//		while(j<=10) {
//			System.out.println("J is: " + j);
//			j++;
//		}
		
//		int cd =3;
//		while(cd >= 0) {
//			System.out.println(cd);
//			cd--;
//		}
//		System.out.println("Happy new year");
		
//		int i =0;
//		while(i < 4) {
//			System.out.println(i);
//			i++;
//		}
		
		int i=1;
		int s=0;
		while(i<=11) {
			System.out.println("S = "+ s);
			s= s +i; 
			i++;
		}
		System.out.println("total of 1 to 10: " + s);
	}
}
