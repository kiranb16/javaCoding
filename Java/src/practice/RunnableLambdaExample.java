package practice;

/*class ThreadDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("run method");
	}
	
}*/
public class RunnableLambdaExample {
 public static void main(String[] args) {
	Runnable runnable= ()->System.out.println(" method from lambda");
	Thread thread= new Thread(runnable);
	thread.start();
}
}
