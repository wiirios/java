package org.william;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] vector = new int[7];
		boolean find = false;
		int start = 0;
		int end = vector.length;
		int middle;
		
		for (int i = 0; i < vector.length; i++) {
			vector[i] = (int) (Math.random() * 10);
			System.out.println(vector[i]);
		}
		
		Arrays.sort(vector);
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digit a number to find");
			int opt = scanner.nextInt();

			while (start <= end) {
				middle = (int) ((start + end) / 2);

				if (vector[middle] == opt) {
					find = true;
					break;			
				}
				else if (vector[middle] < opt) {
					start = middle + 1;
				} else {
					end = middle - 1;
				}
			}
		}
		System.out.println(find);
	}
}
