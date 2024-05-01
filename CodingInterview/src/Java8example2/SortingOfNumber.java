package Java8example2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortingOfNumber {
	public static void main(String[] args) {
		
	
 List< Integer> list= Arrays.asList(23,4,5,1,2,3,4,5,7,23,13,56);
        list.stream().sorted().forEach(System.out::println);
        
        //reversed order
        list.stream().sorted((a1,a2)->(a2.compareTo(a1))).forEach(a->System.out.print(" "+a));
        
        // second way to reverse
        System.out.println("second way to reverse");
        
        list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
}
}