package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntryInterfaceExample {
   public static void main(String[] args) {
	
	   Map<Integer, String> map= new HashMap<>();
	   map.put(1, "a");
	   map.put(2, "b");
	   map.put(3, "c");
	   map.put(4, "d");
	   System.out.println(map);
	   
	   Set<Map.Entry<Integer, String>> set= map.entrySet();
	   for(Map.Entry<Integer, String> hm:set) {
		   System.out.println(hm.getKey()+"=="+hm.getValue());
	   }
	   
	   
	   
//	   while(itr.hasNext()) {
//		   System.out.println(itr.next());
	   
	   
//	   }
	   
	   
}
}
