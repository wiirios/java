package org.william;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) {
		Hashtable<String, String> map = new Hashtable<String, String>();
		
		map.put("a", "dog");
		map.put("b", "cat");
		
		// dog
		System.out.println(map.get("a"));
		
		// true
		System.out.println(map.containsKey("a"));
	}
}
