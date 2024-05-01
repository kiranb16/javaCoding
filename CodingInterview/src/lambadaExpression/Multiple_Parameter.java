package lambadaExpression;

interface FuncInter1{
	int operaion( int a, int b);
}
@FunctionalInterface
interface FuncInter2{
	 void message(String message);
	 
}
public class Multiple_Parameter {
 public static void main(String[] args) {
	
	 FuncInter1 f= (a,b)->a*b;
	 System.out.println(f.operaion(2, 12));
	 
	 FuncInter2 f2= (message)->{
		 return;
		 
	 };
	// System.out.print(f2.message("hello"));
 }
}
