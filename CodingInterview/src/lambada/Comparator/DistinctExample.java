package lambada.Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctExample {
	public static void main(String[] args) {

		List<String> list= Arrays.asList("k","m","n","k");
		
		List<String> uniquelist= new ArrayList<>();
		for(String s:list) {
			if(!uniquelist.contains(s)) {
				uniquelist.add(s);
			}
		}
		System.out.println(uniquelist);
		
		
		List<String> re=list.stream().distinct().collect(Collectors.toList());
		System.out.println("unique list"+re);
	}
	
}
