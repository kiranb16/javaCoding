package optional;

import java.util.Optional;

public class OptionalClassExample {
	public static void main(String[] args) {
	String str[]= new String[10];
	 Optional<String> nullchecks=Optional.ofNullable(str[5]);
	 
	 if(nullchecks.isPresent()) {
		 String lowercaseString=str[5].toLowerCase();
		 System.out.println(lowercaseString);
	 }else
		 System.out.println("string value is not present");
}
}
