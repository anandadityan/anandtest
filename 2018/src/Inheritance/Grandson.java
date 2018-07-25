package Inheritance;


public class Grandson extends Son{

	public static void main(String[] args) {
		
		
		Grandson gs= new Grandson();
		gs.sonactivities();
		gs.city();
		gs.country();
		System.out.println(gs.i);
		
	}

	
	public void sonactivities() {
		System.out.println("Cricket");
	}
	

}
