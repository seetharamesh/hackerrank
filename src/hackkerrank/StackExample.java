package hackkerrank;

import java.util.*;
import java.util.Stack;

class StackExample{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);	
		//initialize an empty stack
		while (sc.hasNext()) {
			String input=sc.next();
			//System.out.println(input);
			//System.out.println(input.length());
			Stack<Character> st = new Stack<Character>();
			char ch = ' ';
			if(input.length() % 2 != 0) System.out.println(false);//added this initial check if odd that means the strings are not closed
			else
			{
			for(int i = 0; i < input.length(); i++) {
				
				ch = input.charAt(i);
				if(!st.isEmpty())//if stack is not empty
				{
					//get each char from input and peek in stack if it has closing braces. 
					//If so pop the input out so that it indicates a matching exist and return true
					switch(ch) {
					case '}': if(st.peek() == '{') {
						st.pop();
					}
					break;
					
					case ']': if(st.peek() == '[') {
						st.pop();
					}
					break;
					
					case ')': if(st.peek() == '(') {
						st.pop();
					}
					break;
					
					default: st.push(ch);
					break;
					}
				} else st.push(ch);
			}
			System.out.println(st.isEmpty());//if anything exists in stack that means brackets are not matching so it was not popped out
			}
		}
		sc.close();
		
	}
}