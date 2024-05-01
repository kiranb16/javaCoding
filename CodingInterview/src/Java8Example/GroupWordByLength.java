package Java8Example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupWordByLength {
public static void main(String[] args) {
	List<String> words= Arrays.asList("i","have","knowledge","of","java");
	Map<Integer, List<String>> lengthwords=words.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(lengthwords);
}
}
 