package StringExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountriesName {
  public static void main(String[] args) {
	List<String> countries= Arrays.asList("India","Usa","west Indies","nepal","london");
	  String list=countries.stream().map(x->x.toUpperCase()).collect(Collectors.joining(","));
	  System.out.println(list);
	
}
}
