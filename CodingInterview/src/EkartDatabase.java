import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
 public static  List<Customer> getAll(){
	 return Stream.of(new Customer(22, "Kiran", "karnbatwal@gmail.com", Arrays.asList("23455","2527656")), 
			 new Customer(233, "ram", "ram@gmail", Arrays.asList("988666","364524")),
			 new Customer(33, "om", "om@gmail", Arrays.asList("88666","4524")),
			 new Customer(21, "sahai", "saha@gmail", Arrays.asList("666","3645")),
			 new Customer(43, "radha", "radha@gmail", Arrays.asList("9886698","3648998524")))
			 .collect(Collectors.toList());
 }
}
