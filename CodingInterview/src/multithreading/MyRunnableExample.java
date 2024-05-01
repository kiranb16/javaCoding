package multithreading;

class MyRun1 implements Runnable {

	@Override
	public void run() {

		System.out.println(" myrun1............");
		System.out.println(" myrun1............");
		System.out.println(" myrun1............");
		System.out.println(" myrun1............");
		System.out.println(" myrun1............");
		System.out.println(" myrun1............");

	}

}

class MyRun2 implements Runnable {

	@Override
	public void run() {

		System.out.println(" myrun2............");
		System.out.println(" myrun2............");
		System.out.println(" myrun2............");
		System.out.println(" myrun2............");
		System.out.println(" myrun2............");
		System.out.println(" myrun2............");
	}

}

public class MyRunnableExample {
	public static void main(String[] args) {

		MyRun1 bullet = new MyRun1();
		Thread gun = new Thread(bullet);

		MyRun2 bullet2 = new MyRun2();
		Thread gun2 = new Thread(bullet2);
		gun.start();
		gun2.start();

	}

}
