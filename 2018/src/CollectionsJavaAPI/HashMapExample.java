package CollectionsJavaAPI;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

@SuppressWarnings("unused")
public class HashMapExample {

	public static void main(String[] args) {
HashMap<Integer, String> hm = new HashMap<Integer, String>();

hm.put(0,"Anand");
hm.put(1,"Somu");
hm.put(22,"Avyakt");
hm.put(23,"Manasa");
hm.put(3,"Null");
hm.put(5,"Dravid");

System.out.println(hm.entrySet());


   Set sn =  hm.entrySet();
   
 Iterator it= sn.iterator();
  
  while(it.hasNext()) {
	  Map.Entry mp=(Map.Entry)it.next();
	  
	  System.out.println(mp.getValue());
	  System.out.println(mp.getKey());  
   
     }

	}
	} 


