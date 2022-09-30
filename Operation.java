package org.example;

import java.util.Arrays;

public class Operation<T extends Comparable<T>> {
	T[]arr;
	
	public void getValue(T[] arr) {
		this.arr = arr;
		maximum();
	}
	
	public <T extends Comparable<T>> void maximum() {
		Arrays.sort(arr);
		findmax();
	}
		public void sort () {
			for (T num : arr) {
				System.out.println(num);
			}
		}
		public void findmax() {
			Integer a = arr.length;
			T object = arr[a - 1];
			System.out.println(object);
		
		}
}
