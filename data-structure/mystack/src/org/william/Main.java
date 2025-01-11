package org.william;

import org.william.filo.Stack;

public class Main {
	public static <T> void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		stack.push("hello");
		stack.push("my");
		stack.push("name");
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
		stack.pop();
		System.out.println(stack.peek());
	}
}
