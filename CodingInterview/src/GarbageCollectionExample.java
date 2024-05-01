
public class GarbageCollectionExample {
	// gc() for new keyword;
	// finalize for except new Keyword;
	
	//sequence  1> finalize 2> gc();
	public static void main(String[] args) {

		// by setting null object;
		// logic 1
		GarbageCollectionExample obj = new GarbageCollectionExample();
		obj = null;

		// logic 2;
		// by anonymous object
		new GarbageCollectionExample();

		// logic 3 : ref to another
		GarbageCollectionExample g1 = new GarbageCollectionExample();
		GarbageCollectionExample g2 = new GarbageCollectionExample();
		g1 = g2;

	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
