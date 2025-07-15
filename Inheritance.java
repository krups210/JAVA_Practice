package Core;

class A{
	A(){
		System.out.println("Class A con");
	}
	public void classA() {
		System.out.println("class A function");
	}
}
class B extends A {
	public void classB() {
		System.out.println("class B function");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		A a = new A();
		a.classA();
		
		B b = new B();
		b.classB();
		b.classA();
		
	}
	
}
