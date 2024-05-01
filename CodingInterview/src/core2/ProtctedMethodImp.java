package core2;

import core.ProtectedMethod;

public class ProtctedMethodImp extends ProtectedMethod {
	
   public static void main(String[] args) {
	 ProtctedMethodImp p= new ProtctedMethodImp();
	 p.protect();
}

@Override
protected void protect() {
	// TODO Auto-generated method stub
	//super.protect();
	System.out.println("child protection");
}
}
