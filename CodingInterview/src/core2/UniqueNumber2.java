package core2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNumber2 {
 public static void main(String[] args) {
	List<Integer> list= Arrays.asList(10,20,30,40,30,50,20,60,70);
	Set<Integer> unique= new TreeSet<>();
	list.stream().filter(e->!unique.add(e)).forEach(System.out::println);
}
}
