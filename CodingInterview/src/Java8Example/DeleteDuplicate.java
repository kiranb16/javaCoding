package Java8Example;

import java.util.Arrays;
import java.util.List;

public class DeleteDuplicate {
 public static void main(String[] args) {
	List<String> list=Arrays.asList("Ram","Ram","shyam","shyam","Ram");
	list.stream().distinct().forEach(System.out::println);
}
}
