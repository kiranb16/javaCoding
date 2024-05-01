package Exceptions;

import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class NoSuchMethodExample {
 public static void main(String[] args) {
	try { Set setExample= new HashSet();
	 setExample.iterator().next();
	 }catch(NoSuchElementException e) {
		 System.out.println("NoSuchElementException  handled");
	 }
}
}
