package MultiThreadingExample;

public class MultiThreading  implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("values of i is "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		 MultiThreading t= new MultiThreading();
		 Thread thread= new Thread(t);
		 thread.start();
		 
		 //object of another thread
		 MyAnotherThread t2= new MyAnotherThread();
		 t2.start();
	}
	
}


