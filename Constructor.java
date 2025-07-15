package Core;

/*
	- constructor is special member function of class. which has same name as class name.
	- constructor not have any datatype.
	- constructor automatically called when object is created.
	
	- There are 3 types of constructor.
		1. default;
		2. parameterized 
		3. copy -> use for object cloning		
 */

class user{
	user(){
		System.out.println("default cons check");
	}
	user(int i){
		System.out.println("i is: " + i);
	}
	user(double i, int j,boolean flag){
		System.out.println("double i = " + i+" : int j = "+j+" : flag = "+flag);
	}	
	public void call() {
		System.out.println("call function check");
	}
}

class user1{
	user1(user u){
		System.out.println("Copy con check " + u);
	}
}

public class Constructor {
	public static void main(String[] args) {
		
		user u1 = new user();
		u1.call();
		user u2 = new user(12);
		user u3 = new user(12.3,34,true);
		user1 u4 = new user1(u1);
	}
}
