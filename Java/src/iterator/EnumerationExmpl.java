package iterator;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExmpl {
	public static void main(String[] args) {
    Vector<Integer> v= new Vector<>();
      v.add(1);
      v.add(3);
      v.add(5);
      v.add(4);
      v.add(2);
      System.out.println(v);
     Enumeration<Integer> numb= v.elements();
     while(numb.hasMoreElements()) {
    	 System.out.println(numb.nextElement());
     }
     System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
     for(Integer n:v) {
    	 System.out.println(n);
     }
	}
}
