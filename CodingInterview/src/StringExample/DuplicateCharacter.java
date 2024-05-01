package StringExample;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
  public static void findIt(String str) {
	  Map<Character, Integer> baseMap= new HashMap<>();
	  
	  char[] charArray= str.toCharArray();
	  
	  for(Character ch: charArray) {
		  if(baseMap.containsKey(ch)) {
			  baseMap.put(ch, baseMap.get(ch)+1);
		  }else {
			  baseMap.put(ch, 1);
		  }
	  }
	  
	  Set<Character> key= baseMap.keySet();
	  for(Character ch:key) {
		  if(baseMap.get(ch)>1) {
			  System.out.println(ch+" is"+baseMap.get(ch)+"times");
		  }
	  }
  }
  public static void main(String[] args) {
	DuplicateCharacter.findIt("SS KK PPP");
}
}
