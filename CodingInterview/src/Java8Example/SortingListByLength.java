package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortingListByLength {
	public static void main(String[] args) {
	 List<String> numbers = Arrays.asList("banana","aaplle","kjksgkbdxj");
	 List<String> re= numbers.stream().sorted((e1, e2)->e2.length()-(e1.length())).collect(Collectors.toList());
	 System.out.println(re);
}
}
