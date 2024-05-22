package interview;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeIterator {
public static void main(String[] args) {
	CopyOnWriteArrayList<Integer> list= new CopyOnWriteArrayList<>(new Integer[] {1,2,3,4,5,6,7});
      Iterator<Integer> itr=list.iterator();
      while(itr.hasNext()) {
    	  if(list.contains(1)) {
    		  list.remove(1);
    	  }
    	  System.out.println(itr.next());
    	  
      }
	
}
}
