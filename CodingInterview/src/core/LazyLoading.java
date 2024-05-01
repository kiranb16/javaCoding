package core;

class Flower {
	private String name;
	private double price;
	private double priceIncTax = 0;

	public Flower(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public double getPriceIncTax() {
		this.priceIncTax = price * 1.25;
       System.out.println("price of flower with tax");
		return priceIncTax;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", price=" + price + ", priceIncTax=" + priceIncTax + "]";
	}

}

public class LazyLoading {
	public static void main(String[] args) {
    Flower tulip= new Flower("Tulip",100);
    System.out.println(tulip);
    
    double priceInclTax=tulip.getPriceIncTax();
    System.out.println(priceInclTax);
	}
}
