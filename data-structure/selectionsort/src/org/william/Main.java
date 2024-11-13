package org.william;

public class Main {
	public static void main(String[] args) {
		int[] vector = new int[6];
		int vL = vector.length;
		
		for (int i = 0; i < vL; i++) {
			vector[i] = (int) (Math.random() * 10);
			System.out.println(vector[i]);
		}

		int a;
		for (int i = 0; i < vL; i++) {
			a = i;
			for (int j = i+1; j < vL; j++) {
				if (vector[j] < vector[a]) {
					a = j;
				}
			}
			int b = vector[a];
			vector[a] = vector[i];
			vector[i] = b;
		}
		
		
		System.out.println("-------");
		
		for (int i = 0; i < vL; i++) {
			System.out.println(vector[i]);
		}
	}
}
