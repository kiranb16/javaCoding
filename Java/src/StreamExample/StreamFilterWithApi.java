package StreamExample;

import java.util.ArrayList;
import java.util.List;

class Product{
	 private int id;
	 private String name;
	 private float price;
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	 
	 
 }
public class StreamFilterWithApi {

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
			 if(product.getPrice()>25000f) {
				 list.add(product);
			 }
		 }
		 for(Product product: list) {
			 System.out.println(product);
		 }
		 // with stream Api
}}


















