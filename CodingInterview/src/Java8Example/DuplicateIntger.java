package Java8Example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateIntger {
 public static void main(String[] args) {
	List<Integer> mylist= Arrays.asList(10,12,15,15,67,56,67);
	Set<Integer> set= new HashSet<>();
	mylist.stream().filter(n->!set.add(n)).forEach(System.out::println);
	
	//System.out.println("first element");
	System.out.println("first element "+mylist.stream().findFirst());
	
	System.out.println(" find any"+mylist.stream().findAny());
	
	long no=mylist.stream().count();
	System.out.println("count :"+no);
	
	 int max=mylist.stream().max(Integer:: compareTo).get();
	 System.out.println(" big element"+max);

	 List<Integer> list=mylist.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	 System.out.println(" rev sorted list "+list);
	 
}
}
