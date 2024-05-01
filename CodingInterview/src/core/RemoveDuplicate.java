package core;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String str = "sandeepppp";
	   removeDuplicate(str);
	}

	public static void removeDuplicate(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();

		for(int i=0; i<str.length(); i++) {
			Character c = str.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				sf.append(c);
				
			}
		}
	System.out.println(sf);

	}
}
