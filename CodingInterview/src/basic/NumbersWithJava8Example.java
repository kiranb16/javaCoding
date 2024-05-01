package basic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class NumbersWithJava8Example {
	public static void main(String[] args) {
     List<Integer> list= Arrays.asList(1,4,2,3,4,5,5,5);
    
     List<Integer> lis=list.stream().distinct().collect(Collectors.toList());
     System.out.println(lis);
      
     Set<Integer> set= new HashSet<>();
     List<Integer> l=list.stream().filter(s->!set.add(s)).distinct().collect(Collectors.toList());
     System.out.println(l);
     
	}
}
