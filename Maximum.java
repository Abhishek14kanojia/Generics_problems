package org.example;

public class Maximum {
		public static void main(String[] args) {
		
			Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
			Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5};
			String[] stringArray = {"a", "b", "c", "d", "e" };
			Operation<Integer> obj = new Operation<>();
			Operation<Double> obj1 = new Operation<>();
			Operation<String> obj2 = new Operation<>();
			obj.getValue(intArray);
			obj1.getValue(doubleArray);
			obj2.getValue(stringArray);
			
		}		
}
 