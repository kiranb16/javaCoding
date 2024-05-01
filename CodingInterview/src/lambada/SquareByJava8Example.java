package lambada;
interface Width{
	public int draw(int width);
}
public class SquareByJava8Example {
  public static void main(String[] args) {
	Width w= (width)->{
		System.out.println("drawing square");
		return width* width;
	};
	int square=w.draw(10);
	System.out.println(square);
}
}
