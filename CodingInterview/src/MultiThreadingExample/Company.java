package MultiThreadingExample;

public class Company {
	int n;
    boolean f=false;
	synchronized public void produceItem(int n) {
		
		if(f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.n = n;
		f =true;
		notify();
		System.out.println(" produced :" + this.n);
	}

	synchronized public int consumeItem() {
		if(!f) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		f= false;
		notify();
		System.out.println("consumed :" + this.n);
		return this.n;
	}
}
