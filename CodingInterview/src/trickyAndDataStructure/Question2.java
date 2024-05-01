package trickyAndDataStructure;

class Test{
	int count;
	Test(){
		count++;
	}
	public void printNumber() {
		System.out.println(count);
	}
}
public class Question2 {
 public static void main(String[] args) {
	Test t1= new Test();
	Test t2= new Test();
	Test t3= new Test();
	t1.printNumber();
	t2.printNumber();
	t3.printNumber();
	// output will 
	/*
	 * 1 1 1
	 */

}
}
