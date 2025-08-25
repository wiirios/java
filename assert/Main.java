package org.william;

import java.nio.file.Path;
import java.nio.file.Paths;
// -ea
public class Main {
	public static void main(String[] args) {
		int value = 10;
		
		assert value > 50 : "Error";
		System.out.println(String.format("The current value is: %d", value));
	}

}
