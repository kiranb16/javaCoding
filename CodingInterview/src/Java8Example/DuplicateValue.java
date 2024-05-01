package Java8Example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateValue {
public static void main(String[] args) {
	List<Integer> list= new ArrayList<>();
	Collections.addAll(list, 1,2,3,3,4,4,5);
	Set<Integer> set= new HashSet<>();
	List<Integer> duplicate=list.stream().filter(i->!set.add(i)).collect(Collectors.toList());
	System.out.println(duplicate);
}
}
