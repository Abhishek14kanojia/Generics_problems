package org.example;

import java.util.Arrays;

public class Operation<T extends Comparable<T>> {
	T[]arr;
	
	public void getValue(T[] arr) {
		this.arr = arr;
		maxi();
	}
	
	public <T extends Comparable<T>> void Maximum() {
		Arrays.sort(arr);
	}
		public void maxi () {
			Integer a = arr.length;
			T object = arr[a - 1];
			System.out.println(object);
		}
}
