package Core;

class Methods{
	
	//without return type without parameter
	public void abc() {
		System.out.println("abc method");
	}
	
	//without return type with parameter
	public void Withpar(double i) {
		System.out.println("i = "+ i);
	}
	
	//with return type without parameter
	public int calling() {
		System.out.println("with return type without parameter");
		return 13;
	}
	//with return type with parameter
	public int getSqure(int i) {
		return i*i;
	}
}

public class Functions_Methods {
	/*
	 	- java methods are blocks of code that perform a specific task.
	 	  A method allows us to reuse code, improving both efficiency and organization.
	 	  
	 	- There are 2 types of methods.
	 		1. Pre Define
	 		2. User Define
	 		
	 	- syntax of object
	 	 	methods obj = new methods;
	 	 	
	 	- Categories
	 		- without return type without parameters
	 		- without return type with parameters
	 		- with return type without parameters
	 		- with return type with parameters
	 		
	 	- public void abc(){}
	 		- public is access specifier
	 		- void is return type
	 		- abc is method name
	 		- () parameter
	 */
	
	public static void main(String[] agrs) {
	
		System.out.println("main method");
		
		Methods m = new Methods();
		m.abc();
		m.Withpar(12);
		int i = m.calling();
		System.out.println(i);
		int sq = m.getSqure(5);
		System.out.println(sq);
		
	}
}
