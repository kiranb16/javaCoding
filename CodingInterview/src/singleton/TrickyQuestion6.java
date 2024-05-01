package singleton;

public class TrickyQuestion6 {
	public static void printdata() {
		System.out.println("print static data !!!!");
	}

	public static void main(String[] args) {
		TrickyQuestion6 tryju = null;
		tryju.printdata();
		// it will not give error above code can be write - TrickyQuestion6.printdata();
	}
}
