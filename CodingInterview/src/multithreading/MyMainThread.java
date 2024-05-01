package multithreading;

class MyThreads1 extends Thread {
	public void run() {
		int i = 0;
		while (i < 20) {
			System.out.println("hi kiran doing multithreading");
			i++;
		}
	}
}

class MyThreads2 extends Thread {
	public void run() {
		int i = 0;
		while (i < 20) {
			System.out.println("hi ganesh playing cricket");
			i++;
		}
	}
}

public class MyMainThread {
	public static void main(String[] args) throws Exception {

		MyThreads1 m1 = new MyThreads1();
		m1.start();
		Thread.sleep(2000);

		MyThreads2 m2 = new MyThreads2();
		m2.start();
		Thread.sleep(2000);
	}
}
