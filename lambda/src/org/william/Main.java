package org.william;

public class Main {
	public static void main(String[] args) {
		FactorialNumber isFactor = (a, b) -> (a % b) == 0;
		
		if (isFactor.test(6, 2)) {
			System.out.println("is factor");
		} else {
			System.out.print("is not factor");
		}
	}
}
