package optional;

import java.util.Arrays;
import java.util.Optional;

public class CustomerTest {
 public static void main(String[] args) {
	Customer c=new Customer(123, "abc", "abc@gmail.com", Arrays.asList(123445,987654));
	Customer c1=new Customer(123, null, null, Arrays.asList(123445,987654));
	//optional.empty   
	//2) optional.of it is only method that gives NullpointerException  
	//3) optional.nullable
	
	Optional<String> email=Optional.of(c.getEmail());
	  System.out.println(email);
	  
//	  Optional<String> email=Optional.of(c1.getEmail());
//	  System.out.println(email);
	  
	  Optional<String> name=Optional.ofNullable(c1.getName());
	  System.out.println(name.orElse("Krishna"));
	  
	  Customer c2=new Customer(123, "Kiran", "abc@gmail.com", Arrays.asList(123445,987654));
	  Optional<String> re=Optional.ofNullable(c2.getName());
	 // System.out.println(re.orElseThrow(()-> new IllegalArgumentException(" name not present")));
	  
	  System.out.println(re.map(String::toUpperCase).orElseGet(()->"Default name Kiran"));
	  
}
}
