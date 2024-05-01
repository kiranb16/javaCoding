import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMap {
	public static void main(String[] args) {
		List<Customer> customers = EkartDatabase.getAll();
		
		/*
		 * List<String> emails = customers.stream().map(customer ->
		 * customer.getEmail()).collect(Collectors.toList());
		 * System.out.println(emails);
		 */
			  List<List<String>> phone = customers.stream().map(customer ->
			  customer.getPhoneNumber()) .collect(Collectors.toList());
			  System.out.println(phone);
			  
			  List<String> phones =
			  customers.stream().flatMap(e->e.getPhoneNumber().stream()).collect(Collectors
			  .toList()); System.out.println(phones);
			 
			  
			 
		
	}
}
