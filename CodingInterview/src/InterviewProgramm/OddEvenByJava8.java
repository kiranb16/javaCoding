package InterviewProgramm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenByJava8 {
public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,5);
	List<Integer> evenNumber=list.stream().filter(x->x%2==0).collect(Collectors.toList());
	  System.out.println("even numbers"+evenNumber);
	  List<Integer> oddNumber=list.stream().filter(x->x%2!=0).collect(Collectors.toList());
	  System.out.println("odd Numbers"+oddNumber);
}
}
