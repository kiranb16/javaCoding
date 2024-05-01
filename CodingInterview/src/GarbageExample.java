
public class GarbageExample {
  public static void main(String[] args) {
	GarbageExample gc= new GarbageExample();
	System.out.println(gc.hashCode());
	gc= null;
	System.gc();
	System.out.println("End of garabage Collection");
	
}

@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	System.out.println("finalize method called");
}
}
