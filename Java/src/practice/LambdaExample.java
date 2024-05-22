package practice;

interface Shape{
	void draw();
}
interface parallel{
	void line();
}

public class LambdaExample{
	public static void main(String[] args) {
		print(()->System.out.println("rectangle class: draw() method"));
		print(()-> System.out.println("circle class : draw() method "));
		print(()->System.out.println("tringle class : draw() method"));
	}
	private static void print( Shape shape) {
		shape.draw();
	}
	
}  