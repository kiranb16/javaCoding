
public class Sample {
	void eat() {
		System.out.println("eating");
	}
	void run() {
		this.eat();
		System.out.println("runnig");
	}
	public static  void main(String[] args) {
		Sample s= new Sample();
		s.run();
     
		
	}
}
