package CollectionsJavaAPI;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("anand");
		a.add("somu");
		a.add(0, "Names");
		a.add("anand");
		//a.remove(1);
		System.out.println(a.get(2));
		
		System.out.println(a.indexOf("anand"));
		 System.out.println(a.contains("anand"));
		System.out.println(a.isEmpty());
		 System.out.println(a.size());
		 				
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
