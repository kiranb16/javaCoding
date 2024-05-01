package lambada;

import java.util.Arrays;
import java.util.List;

public class SupplierDemo2 {
 public static void main(String[] args) {
	
	List<String> list= Arrays.asList();
	System.out.println(list.stream().findAny().orElseGet(()->" hi Kiran Batwal"));
}
}
