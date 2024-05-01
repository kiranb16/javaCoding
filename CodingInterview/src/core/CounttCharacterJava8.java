package core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class CounttCharacterJava8 {
public static void main(String[] args) {
	String str="Communication";
	String[] plain=str.split("");
	Map<Object, Long> result=Arrays.stream(plain).map(String::toLowerCase)
	.collect(Collectors.groupingBy(s->s,LinkedHashMap:: new, Collectors.counting()));
	System.out.println(result);
	
	/*
	 * String[] plain = str.split("");
		Map<Object, Long> re=Arrays.stream(plain).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s->s, TreeMap:: new , Collectors.counting()));
		System.out.println(re);
	 */
	
}
}
