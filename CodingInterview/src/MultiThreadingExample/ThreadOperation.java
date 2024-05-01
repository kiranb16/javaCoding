package MultiThreadingExample;

public class ThreadOperation {
 public static void main(String[] args) {
	System.out.println("program strated");
	int x= 23+34;
	System.out.println("value of x"+x);
	  Thread t=Thread.currentThread();
	  String name=t.getName();
	  System.out.println(t.getId() );
	   try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  System.out.println("name of thread is "+name);
	  
	
	System.out.println("program ended");
}
}
