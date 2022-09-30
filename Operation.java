package org.example;

public class Operation<T extends String> {
	String a;
	String b;
	String c;
	
	public String Maximum(String a, String b, String c) {
		this.a = a;
		this.b = b;
		this.c = c;
		
		String maximum = a;
		if (b.compareTo(maximum) > 0) {
			maximum = b;
			
		} if (c.compareTo(maximum) > 0) {
			maximum = c;
		} return maximum;
	}

}
