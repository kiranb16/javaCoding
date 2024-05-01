package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {
 public static void main(String[] args) {
	List<Integer>  list= new ArrayList<>();
	list.add(12);
	list.add(23);
	list.add(34);
	list.add(12);
	
	Set<Integer> set= new LinkedHashSet<>(list);
	System.out.println(" no duplicate and maintain insertion order "+set);
	
	Set<Integer> set2= new HashSet<>(list);
	System.out.println("no duplicate only"+set2);
	
	
	
	
}
}
