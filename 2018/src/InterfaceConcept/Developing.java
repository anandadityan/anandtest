package InterfaceConcept;

public class Developing implements bankingClient {
	
	//class is responsible for implementing all the methods in banking client interface

	public static void main(String[] args) {
		
		Developing d = new Developing();
		d.paycreditcard();
		d.transferbalance();
		d.login();
		
		System.out.println("-------------------------");
		bankingClient dr = new Developing();
		dr.paycreditcard();
		dr.transferbalance();
	}
		
		
		
		/* this is runtime polymorphism. banking client return type is added to consider methods from its interface not methods in this class. 
				this is executed in Runtime. login method below is not seen in it as it belongs to class */


	
	public void paycreditcard() {
		
	System.out.println("paycredit implemented");	
		
	}


	public void transferbalance() {
		
	System.out.println("Transfer balance implemented");	
		
	}
	
	public void login() {   // additional method added in this class, other methds are implemented from interface
	
	System.out.println("Login Implemented");

}
}