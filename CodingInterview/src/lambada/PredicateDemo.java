package lambada;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
 public static void main(String[] args) {
		/*
		 * Predicate<Integer> predicate= (t)->{ if(t%2==0) return true; else return
		 * false; }; System.out.println(predicate.test(12));
		 */
	 
	 List<Integer> list= Arrays.asList(2,3,4,5,6);
	 list.stream().filter(t->t%2!=0).forEach(System.out:: println);
}
}
