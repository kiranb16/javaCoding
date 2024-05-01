package java8NewExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestString {
 public static void main(String[] args) {
	 String [] strArray= {"kiranBatwal","java advanced j2ee and springboot","microservicesss","chiku"};
	    String longest=Arrays.stream(strArray).reduce((w1,w2)->w1.length()>w2.length()?w1:w2).get();
	    System.out.println(longest);
	    
	   System.out.println("--------------------------------------------------------"); 
	    int [] number= {1,2,3,4,12,23,22};
	    List<String> start=Arrays.stream(number).boxed().map(s->s+"").filter(s->s.startsWith("2")).collect(Collectors.toList());
	   System.out.println(start); 
	   
	   List<String> list= Arrays.asList("Kiran","Vasant","Batwal");
	   String rsult=String.join("-", list);
	   System.out.println(rsult);
	   
	   IntStream.rangeClosed(1, 10).skip(1).limit(8).forEach(System.out::println);
}
}
