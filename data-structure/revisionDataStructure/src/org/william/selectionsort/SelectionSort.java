package org.william.selectionsort;

public class SelectionSort<T> {
	public int[] fun(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			int a = i;
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < vector[a]) {
					a = j;
				}
			}
			int b = vector[a];
			vector[a] = vector[i];
			vector[i] = b;
		}
		
		return vector;
	}
}
