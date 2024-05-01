package Java8Example;

import java.util.Arrays;
import java.util.List;

public class StringLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("welcome", "batwal", "sairam", "mahadev");
		Long count=list.stream().filter(x->x.length()>5).count();
		System.out.println(" words are with greater than 5 ares : "+count);
	}

}
 