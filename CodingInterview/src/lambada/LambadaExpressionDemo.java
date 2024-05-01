package lambada;
@FunctionalInterface
interface Drawable2{
	public void draw(int width);
}
public class LambadaExpressionDemo {
 public static void main(String[] args) {
	Drawable2 d=(width)->{
		System.out.println(" drawing width "+width);
	};
	d.draw(12);
}
}
