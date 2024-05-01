package concurrentModifcationException;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMapExample {
   public static void main(String[] args) {
	Map<String, String>mymap= new ConcurrentHashMap<>();
	mymap.put("1", "one");
	mymap.put("2", "two");
	mymap.put("3", "three");
	
	Iterator<String> itr=mymap.keySet().iterator();
	while(itr.hasNext()) {
		String key=itr.next();
		
	}
}
}
