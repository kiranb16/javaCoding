package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {
 public static void main(String[] args) {
	Map<Integer, String> map= new HashMap<>();
	  map.put(1, "Kiran");
	  map.put(3, "Rahul");
	  map.put(2, "Sanjay");
	  System.out.println(" original hashmap"+map);
	  int keyToBeRemoved=2;
	  Iterator<Entry<Integer, String>> iterator  =map.entrySet().iterator();
	  
	  while(iterator.hasNext()) {
		  
		  Map.Entry<Integer, String> entry =  iterator.next();
		  
		 
		if(keyToBeRemoved== entry.getKey()) {
			  iterator.remove();
		  }
	  }
	  System.out.println("modified Hashmap"+map);
	  
}
}
