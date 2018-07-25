package CollectionsJavaAPI;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
	
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		hs.add("Sri Lanka");
		//System.out.println(hs);
		//System.out.println(hs.isEmpty());
		//System.out.println(hs.size());
		
		Iterator<String> i=hs.iterator();
		
		while(i.hasNext()) {
		System.out.println(i.next());
	
	}

}
	}
