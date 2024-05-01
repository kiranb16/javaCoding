package practice;

import java.util.Stack;

public class ValidateBracket {
  public static void main(String[] args) {
	 String s="{}()";
	 boolean status=validateStringBacket(s);
	 System.out.println(s);
	 System.out.println(status);
	  
}

private static boolean validateStringBacket(String s) {
	 Stack<Character> stack= new Stack<>();
	  for(int i=0; i<s.length(); i++) {
		  char c= s.charAt(i);
		  if(c=='}') {
			  if(stack.peek()=='{') {
				  stack.pop();
			  }else {
				  return false;
			  }
			  
		  }else if(c==')') {
			  if(stack.peek()==')') {
				  stack.pop();
			  }else {
				  return false;
			  }
			  
		  }else if(c==']') {
			  if(stack.peek()==']') {
				  stack.pop();
			  }else {
				  return false;
			  }
			  
		  }else {
			  stack.push(c);
		  }
	  }if(stack.size()==0) {
		  return true;
	  }
	return false;
}
}
