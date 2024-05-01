package singleton;
class E{
	public void print(Object obj) {
		System.out.println("method with object");
	}
	public void print( String str) {
		System.out.println("method with String");
	}
}
public class TrickyQuestion4 {
public static void main(String[] args) {
	E e= new E();
	e.print(null);
}
}
