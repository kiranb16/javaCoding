package java8Coding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AAA {
	public static void main(String[] args) {
		String s = "Kiran  Kvasant Batwal";
		Map<String, Long> result = Arrays.stream(s.split(""))
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap:: new , Collectors.counting()));
		
		String Noc=result.entrySet().stream().filter(e->e.getValue()==1).map(Map.Entry:: getKey).findFirst().get();
		System.out.println(Noc);
	}
}
