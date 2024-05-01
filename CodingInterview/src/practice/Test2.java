package practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world";

//		h=1
//		e=1
//		l=3
//		o=2
//		w=1
		
		Map<String, Long> m = Arrays.asList(s.split("")).stream().filter(l -> !l.trim().equals(""))
				.collect(Collectors.groupingBy(String::new, Collectors.counting()));
		
		System.out.println(m);
		
		m = m.entrySet().stream().sorted(Map.Entry.comparingByValue((o1, o2) -> o2.compareTo(o1)))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (t, u) -> u, LinkedHashMap::new));
		System.out.println(m);

		
	}

}
