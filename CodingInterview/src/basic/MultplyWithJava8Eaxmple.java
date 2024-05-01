package basic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

interface multible {
	public int multi(int a, int b);
}

public class MultplyWithJava8Eaxmple {
	public static void main(String[] args) {

		multible m = (a, b) -> (a * b);
		System.out.println(m.multi(12, 12));
		
		List<Integer> list= Arrays.asList(1,2,3,4,5);
		System.out.println("multiplication");
		System.out.println(list.stream().reduce(1, (a,b)->(a*b)));
		
		Optional<Integer> max=list.stream().max(Integer::compare);
		System.out.println("big :"+max);
		
		Optional<Integer> maxInt=list.stream().max((a,b)->a.compareTo(b));
		System.out.println(maxInt);
		
		
		
		
		
		
		
	}
}
