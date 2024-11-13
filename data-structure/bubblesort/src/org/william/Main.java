package org.william;

public class Main {
	public static void main(String[] args) {
		int[] vector = new int[7];
		int vectorLength = vector.length;
		
		for (int i = 0; i < vectorLength; i++) {
			vector[i] = (int) (Math.random() * 10);
			System.out.println(vector[i]);
 		}
		
		for (int i = 0; i < vectorLength; i++) {
			for (int j = i + 1; j < vectorLength; j++) {
				if (vector[i] > vector[j]) {
					int a = vector[i];
					vector[i] = vector[j];
					vector[j] = a;
				}
			}
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < vectorLength; i++) {
			System.out.println(vector[i]);
 		}
	}
}
