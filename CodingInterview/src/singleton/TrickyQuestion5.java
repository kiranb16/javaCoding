package singleton;
class E1{
	public void print(Object obj) {
		System.out.println("method with object");
	}
	public void print( String str) {
		System.out.println("method with String");
	}
	public void print( StringBuffer str) {
		System.out.println("method with String");
	}
}
public class TrickyQuestion5 {
public static void main(String[] args) {
	E1 e= new E1();
	//e.print(null); its create ambiguity for compile program
}
}