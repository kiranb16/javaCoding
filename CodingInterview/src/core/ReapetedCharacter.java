package core;

import java.util.HashMap;
import java.util.Map;

public class ReapetedCharacter{
	 public static void main(String[] args) {
		String s="aaabbbcc";
		char ch;
		Map<Character, Integer> map= new HashMap<>();
		for(int i=0; i<s.length(); i++) {
			ch=s.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}
}