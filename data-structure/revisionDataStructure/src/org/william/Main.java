package org.william;

import java.util.Arrays;
import java.util.Scanner;

import org.william.bubblesort.BubbleSort;
//import org.william.selectionsort.SelectionSort;
import org.william.binarysearch.BinarySearch;

public class Main {
	public static void main(String[] args) {
		int[] vector = new int[7];
		int vL = vector.length;
		BubbleSort<int[]> bubble = new BubbleSort<int[]>();
		//SelectionSort<int[]> selection = new SelectionSort<int[]>();
		BinarySearch binary = new BinarySearch();
		
		for (int i = 0; i < vL; i++) {
			vector[i] = (int) (Math.random() * 10);
		}
		
		bubble.fun(vector);
		
		for (int i = 0; i < vL; i++) {
			System.out.println(vector[i]);
		}
		
		try (Scanner scanner = new Scanner(System.in);) {
			System.out.println("Enter a number to find");
			int number = scanner.nextInt();
			
			System.out.println(binary.fun(vector, number));
		}
		
		//selection.fun(vector);
	}
}
