package typecasting;

public class Child extends Parent {

	public static void main(String[] args) {
		
		Parent p= new Child();  // run time polymorphism
		p.m1();
		//p.m2();
		
		Child c=(Child) p;  // Typecasting
		c.m2();

	}
	
	void m1() {  // overriding method 
		
		System.out.println("child m1");
	}
	
	void m2() {
		System.out.println("child m2");
	}

}
