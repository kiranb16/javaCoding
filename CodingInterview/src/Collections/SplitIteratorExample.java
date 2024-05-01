package Collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorExample {
  public static void main(String[] args) {
	ArrayList<Double> list= new ArrayList<>();
	list.add(1.0);
	list.add(2.0);
	list.add(3.0);
	list.add(4.0);
	list.add(5.0);
	Spliterator<Double> spltitr=list.spliterator();  // use with java 8 and in parallel stream
	while(spltitr.tryAdvance(n->System.out.println(n)));
	System.out.println("------------------------forEachRemaining----------------------------");
	//spltitr.forEachRemaining(n->System.out.println(n));
	
	
}
}
