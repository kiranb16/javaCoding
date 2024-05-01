package Java8Example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FabbanoccisSeriesBy8 {
	
	public static void main(String[] args) {
    String fibonnocis= Stream.iterate(new int[]{0,1}, t-> new int[] {t[1],t[0]+t[1]})
     .limit(10)
     .map(t->t[0])
     .map(String:: valueOf)
     .collect(Collectors.joining(","));
    System.out.println(fibonnocis);
     

	}
}
