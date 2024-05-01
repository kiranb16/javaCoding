package MultiThreadingExample;
//creating thread using Thread class
public class MyAnotherThread extends Thread {
  public void run() {
	  //task for thread
	  for(int i=10; i>=0; i--) {
		  System.out.println("values of i "+i);
		  try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
  }
  public static void main(String[] args) {
	 MyAnotherThread t= new MyAnotherThread();
	   t.start();
}
}
