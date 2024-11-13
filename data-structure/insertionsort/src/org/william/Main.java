package org.william;

public class Main {
	public static void main(String[] args) {
		int[] vector = new int[6];
		int vL = vector.length;
		
		for (int i = 0; i < vL; i++) {
			vector[i] = (int) (Math.random() * 10);
			System.out.println(vector[i]);
		}
		
		for (int i = 0; i < vL; i++) {
			int a = vector[i];
			int j = i - 1;
			while (j >= 0 && vector[j] > a) {
				vector[j + 1] = vector[j];
				j--;
			}
			vector[j + 1] = a;
		}
		
		System.out.println("-------------");
		
		for (int i = 0; i < vL; i++) {
			System.out.println(vector[i]);
		}
	}
}
