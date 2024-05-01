package java8NewExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import core.RandomNumber;

public class ListToArray {
   public static void main(String[] args) {
	List<String> list= new ArrayList<>();
	list.add("Yash");
	list.add("sanju");
	list.add("manju");
	 
	  String names[]=list.toArray(new String[list.size()]);
	  System.out.println(Arrays.toString(names));
	  
	  // random number generartion
	  Random random= new Random();
	  random.ints(1,100).limit(10).sorted().forEach(System.out::println);
	 
	
	
}
}
