package MultiThreadingExample;

public class ThreadingExample {
	public static void main(String[] args) {
		Runnable t1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("thread start t1");

			}
		};
		new Thread(t1).start();

		Runnable t2 = () -> System.out.println("thread t2 start");
		t2.run();
		//new Thread(t2).start();
		
		new Thread(()->System.out.println("Thread 3.1 start ")).start();
	}
}
