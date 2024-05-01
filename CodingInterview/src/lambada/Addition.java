package lambada;
@FunctionalInterface
interface adable{
	public void add(int a,int b);
}
public class Addition {
public static void main(String[] args) {
	adable adable=(a,b)->System.out.println(a+b);
	adable.add(12, 34);
	
}
}
