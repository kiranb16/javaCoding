package practice;

import java.util.HashSet;
import java.util.Set;

public class Practice {
	public static void main(String[] args) {
		String str = "KkkirRRAAannnN";
		removeDuplicate(str);
	}

	private static void removeDuplicate(String str) {
		str=str.toUpperCase();
		Set<Character> set= new HashSet<>();
		StringBuilder sb= new StringBuilder();
		for(int i=0; i<str.length();i++) {
			Character ch=str.charAt(i);
			if(!set.contains(ch)) {
				set.add(ch);
				sb.append(ch);
			}
		}
		System.out.println(sb);
		
	}
}