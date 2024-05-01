package lambada;
@FunctionalInterface
interface  Drawable{
	public void draw(int width);
}
public class LambadaExpressionDemoByConventional {
public static void main(String[] args) {
	Drawable drawable= new Drawable() {
		
		@Override
		public void draw(int width) {
			System.out.println("drawing :"+width);
			
		}
	};
	drawable.draw(10);
}
}
