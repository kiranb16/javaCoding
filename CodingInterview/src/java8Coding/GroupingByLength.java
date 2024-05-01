package java8Coding;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByLength {
 public static void main(String[] args) {
	List<String> list= Arrays.asList("apple","banana","lemon","pineapple");
	Map<Integer, List<String>> res=list.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(res);
}
}
