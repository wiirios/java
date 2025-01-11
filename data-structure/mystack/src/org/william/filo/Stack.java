package org.william.filo;

import java.util.ArrayList;

public class Stack<T> {
	private ArrayList<String> stack = new ArrayList<String>();
	private int stackLength = 0;
	private static boolean isEmpty = true;
			
	/**
	 * add
	 */
	public void push(String value) {
		stack.add(value);
		isEmpty = false;
		
		if (empty() == false) stackLength++;
	}	
	
	/**
	 * remove
	 */
	public void pop() {
		if (empty() == false) {
			stack.remove(stackLength-1);
			
			if (stackLength == 1) {
				isEmpty = true;
			}
			stackLength--;
		}
	}
	
	/**
	 * get all objects
	 */
	
	public void getAll() {		
		for (String i:stack) {
			System.out.println(i);
		}
	}
	
	/**
	 * get the object at top of this stack
	 */
	
	public String peek() {
		if (empty() == false) {
			return stack.get(stackLength-1);
		}
		return null;
	}
	
	/**
	 * test if this stack is empty
	 */
	
	public static boolean empty() {
		return isEmpty;
	}
	
	/**
	 * returns this stack length
	 */
	
	public int length() {
		return stackLength;
	}
}
