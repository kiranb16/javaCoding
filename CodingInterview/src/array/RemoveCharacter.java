package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCharacter {
  public static void main(String[] args) {
	String str="Kirran Batwaal";
	StringBuilder sb= new StringBuilder();
	Set<Character> set = new LinkedHashSet<>();
	
	for(int i=0; i<str.length(); i++) {
		set.add(str.charAt(i));
		
	}
	for(char c:set) {
		sb.append(c);
	}
	System.out.println(sb);
	
	str.chars().distinct().forEach(e->System.out.print((char)e));
}
}
