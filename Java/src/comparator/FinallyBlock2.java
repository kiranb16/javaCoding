package comparator;
interface interface3{
	public void sum(int a,int b);
}
class DemoTwo implements interface3{

	@Override
	public void sum(int a, int b) {
		System.out.println("the sum :"+(a+b));
		
	}
	public class Test1{
		public static void main(String[] args) {
			 interface3 i= new DemoTwo();
			 i.sum(3, 6);
		}
	}
}
/*

interface interfac3 {
	public void sum(int a, int b);
}

class DemoTwo implements interfac3 {

	public void sum(int a, int b) {
		System.out.println("The Sum: " + (a+b));
	}
}

class Test1 {
	public static void main(String[] args) {
		
		interfac3 i = new DemoTwo();
		i.sum(5, 7);
	}
}
*/