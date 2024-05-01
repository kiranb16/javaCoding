package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListExample {
public static void main(String[] args) {
	List<String> list= new ArrayList<>();
	list.add("aaple");
	list.add("banana");
	list.add("mango");
	list=(List<String>) Collections.unmodifiableCollection(list);
	System.out.println(list);
	/*list.add("gauva");   //it gives exception
	System.out.println(list);
*/
}}
