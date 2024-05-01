package Java8Example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeated2 {
  public static void main(String[] args) {
	String s=" kirran batwal";
	char c[]=s.toCharArray();
    Map<Character, Integer> map= new HashMap<>();
    
	for(int i=0; i<c.length; i++) {
		Integer value= map.get(c[i]);
	  if(map.containsKey((c[i]))) {
		  map.put(c[i], value+1);
		  
	  }else {
		  map.put(c[i], 1);
	  }
	}
	System.out.println(map);
	Iterator<Character> m =map.keySet().iterator();
	
	while(m.hasNext()) {
		Character ch =m.next();
		 
	}
	}
}













