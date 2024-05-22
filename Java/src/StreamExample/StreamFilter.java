package StreamExample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
// Traditional Way to filter product;
class Product{
	private int id;
	private String name;
	private float salary;
	public Product(int id, String name, float salary) {
		this.id= id;
		this.name= name;
		this.salary= salary;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}

public abstract class StreamFilter {
	
	private static List<Product> getProduct(){
		List<Product> productslist= new ArrayList<>();
		productslist.add(new Product(111,"Samsung", 23000f));
		productslist.add(new Product(222,"HP", 30000f));
		productslist.add(new Product(333,"nokia", 35000f));
		return productslist;

}
	
public static void main(String[] args) {
	 List<Product> list= new ArrayList<>();
	 for(Product product: getProduct()) {
		 if(product.getSalary()>25000) {
			 list.add(product);
		 }
	 }
	 for(Product product: list) {
		 System.out.println(product);
	 }
	  g
	 
	}

	
}










