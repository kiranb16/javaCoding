package Java8Example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AAA {
 public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,4,5,6,7,8,9);
		list.stream().map(i->i*i*i).collect(Collectors.toList()).forEach(System.out::println);

}
}
