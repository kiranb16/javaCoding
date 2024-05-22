package StreamExample;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
 public static void main(String[] args) {
	Stream<String> stream= Stream.of("a","b","c");
	stream.forEach(System.out::println);
	
	// stream for collection
	Collection<String> collection= Arrays.asList("Kiran", "Ravi", "Sanjay", "Ganesh");
	Stream<String> stream2= collection.stream();
	stream2.forEach(System.out:: println);
	
	// stream for list;
	List<String> list= Arrays.asList("java","hibernate","advance java");
	Stream<String> stream3= list.stream();
	stream3.forEach(System.out:: println);
	
	System.out.println("*******************************************************");
	
	// stream for set
	Set<String> set= new HashSet<>(list);
	Stream<String> stream4= set.stream();
	stream4.forEach(System.out:: println);
	System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::");
	// stream of array
	String[] strArrays= {"git","jira","tomcat"};
	Stream<String> stream5= Arrays.stream(strArrays);
	stream5.forEach(System.out::println);
	
	
}
}























 
 