package datastructurelinklist.com;

import java.util.LinkedList;

public class UC2StackEmpty {
	
	public static void main(String args[]) {
		/*
		 *@purpose: use peak and pop method perform peek value and stack empty.
		 *@return: No return value
		 */

		LinkedList<Integer>number = new LinkedList<Integer>();
		number.push(70);
		number.push(30);
		number.push(56);
		System.out.println(number);
	    
	    System.out.println(number.peek());
	    
       number.pop();
       System.out.println(number);
       
       number.pop();
       number.pop();
       System.out.println(number);
	   
	    }
	}



