package concurrentModifcationException;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class copyArraylistExample {
  public static void main(String[] args) {
	List<String> marvel= new CopyOnWriteArrayList<>();
	marvel.add("ironman");
	marvel.add("america");
	marvel.add("hulk");
	marvel.add("black");
	marvel.add("spiderman");
	// use for loop instead iterator to avoid concurrentModificationException
	
	for(int i=0; i<marvel.size(); i++) {
		if(marvel.get(i).equals("black")) {
			marvel.remove(i);
			marvel.add("ramayan");
			System.out.println(marvel);
		}
	}
	System.out.println("size "+marvel.size());
	
}
}
