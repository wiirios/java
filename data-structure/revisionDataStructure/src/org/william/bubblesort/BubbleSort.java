package org.william.bubblesort;

public class BubbleSort<T> {
	public int[] fun(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] > vector[i]) {
					int a = vector[j];
					vector[j] = vector[i];
					vector[i] = a;
				}
			}
		}
		return vector;
	}
}
