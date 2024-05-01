package StringExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringLengthExample {
	public static void main(String[] args) {
      List<String> list= Arrays.asList("java","angular","c","c++","python");
      List<String> listem = list.stream().filter(e->e.length()>3).collect(Collectors.toList());
      System.out.println(listem);
	}
}
