package java8Coding;

import java.util.ArrayList;
import java.util.List;

public class ProductTest {
  public static void main(String[] args) {
	List<Product> list= new ArrayList<>();
	list.add(new Product(111, "hp", 13000f));
	list.add(new Product(555, "samsung", 130500f));
	list.add(new Product(333, "nokia", 3000f));
	list.add(new Product(444, "lenovo", 13000f));
	
	// product less than 5000;
	list.stream().filter(e->e.getPrice()<5000f).forEach(System.out::println);
	
	
	
	
}
}
