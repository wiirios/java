package org.william.binarysearch;

public class BinarySearch {
	public boolean fun(int[] vector, int number) {
		boolean r = false;
		int first = 0;
		int last = vector.length - 1;
		
		for (int i = 0; i < vector.length; i++) {
			int mid = (first + last) / 2;
			if (vector[mid] == number) {
				r = true;
				break;
			} else if (vector[mid] > number) {
				first = mid + 1;
			} else {
				last = mid - 1;	
			}
		}
		return r;
	}
}
