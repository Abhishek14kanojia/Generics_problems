package org.example;

public class Operation<T extends Number> {
	Float a;
	Float b;
	Float c;
	
	public void Maximum(Float a, Float b, Float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		if (a>b) {
		if (a>c) {
			System.out.println(a + "is maximum");
			
		}else {
			System.out.println(c + "is maximum");
			
		}
		}else if (b>c) {
			System.out.println(b + "is maximum");
		}else {
			System.out.println(c + "is maximum");
		} 
	}

}
