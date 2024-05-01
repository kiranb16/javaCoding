package trickyAndDataStructure;

public class Question6 {
	public static void main(String[] args) {
		System.out.println(fun());
	}
 static int fun() {
	//static int x=0;  // local variable can't make static , abstract compile error   but can use final;
	int x=0;
	 return ++x;
 }
 
}
