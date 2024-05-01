package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringCount {
 public static void main(String[] args) {
	 List<String> list= Arrays.asList("kiran","rehansh","love","shyam");
	List<String> li= list.stream().filter(e->e.length()>4).collect(Collectors.toList());
	System.out.println(li);
}
}
